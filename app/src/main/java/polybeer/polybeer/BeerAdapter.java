package polybeer.polybeer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import polybeer.polybeer.Object.Beer;

public class BeerAdapter extends ArrayAdapter<Beer>{

    public BeerAdapter(Context context,List<Beer> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.beer_activity,parent, false);
        }

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        if(viewHolder == null){
            viewHolder = new ViewHolder();

            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.beerImage);
            viewHolder.textView_name = (TextView) convertView.findViewById(R.id.beerName);
            viewHolder.textView_tagline = (TextView) convertView.findViewById(R.id.beerTagline);
            convertView.setTag(viewHolder);
        }

        Beer beer = getItem(position);

        //Picasso pour afficher directement l'image depuis l'url
        Picasso.with(getContext()).load(beer.getImage_url()).into(viewHolder.imageView);
        viewHolder.textView_name.setText(beer.getName());
        viewHolder.textView_tagline.setText(beer.getTagline());

        return convertView;
    }

    private class ViewHolder{
        public ImageView imageView;
        public TextView textView_name;
        public TextView textView_tagline;
    }

}
