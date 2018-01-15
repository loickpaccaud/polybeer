package polybeer.polybeer;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import polybeer.polybeer.Object.Beer;

public class BeerAdapter extends ArrayAdapter<Beer>{

    public BeerAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        //todo
        
        return convertView;
    }

}
