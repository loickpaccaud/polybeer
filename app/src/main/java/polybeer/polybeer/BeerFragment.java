package polybeer.polybeer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import polybeer.polybeer.Object.Beer;

public class BeerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.beer_activity, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Beer beer = new Beer();
        beer(beer);
    }

    public void beer(Beer beer){

        Picasso.with(getContext()).load(beer.getImage_url()).into((ImageView) getActivity().findViewById(R.id.beerImageDetails));

        ((TextView) getActivity().findViewById(R.id.beerNameDetails)).setText(beer.getName());
        ((TextView) getActivity().findViewById(R.id.beerTaglineDetails)).setText(beer.getTagline());
        ((TextView) getActivity().findViewById(R.id.beerDescriptionDetails)).setText(beer.getDescription());
    }
}
