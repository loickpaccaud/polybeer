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
        return inflater.inflate(R.layout.beer_details_activity, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        beer((Beer) bundle.getSerializable("beer"));
    }

    public void beer(Beer beer){

        Picasso.with(getContext()).load(beer.getImage_url()).into((ImageView) getActivity().findViewById(R.id.beerImageDetails));

        ((TextView) getActivity().findViewById(R.id.beerNameDetails)).setText(beer.getName());
        ((TextView) getActivity().findViewById(R.id.beerTaglineDetails)).setText(beer.getTagline());
        ((TextView) getActivity().findViewById(R.id.beerDescriptionDetails)).setText(beer.getDescription());
        ((TextView) getActivity().findViewById(R.id.beerBrewersTipsDetails)).setText(beer.getBrewers_tips());

        ((TextView) getActivity().findViewById(R.id.beerABVDetails)).setText(beer.getAbv().toString());
        ((TextView) getActivity().findViewById(R.id.beerIBUDetails)).setText(beer.getIbu().toString());
        ((TextView) getActivity().findViewById(R.id.beerTargetFGDetails)).setText(beer.getTarget_fg().toString());
        ((TextView) getActivity().findViewById(R.id.beerTargetOGDetails)).setText(beer.getTarget_og().toString());
        ((TextView) getActivity().findViewById(R.id.beerEBCDetails)).setText(beer.getEbc().toString());
        ((TextView) getActivity().findViewById(R.id.beerSRMDetails)).setText(beer.getSrm().toString());
        ((TextView) getActivity().findViewById(R.id.beerPHDetails)).setText(beer.getPh().toString());

        ((TextView) getActivity().findViewById(R.id.beerAttenuationLevelDetails)).setText(beer.getAttenuation_level().toString());

        ((TextView) getActivity().findViewById(R.id.beerIngredientsMaltDetails)).setText("");
        ((TextView) getActivity().findViewById(R.id.beerIngredientsHopsDetails)).setText("");
        ((TextView) getActivity().findViewById(R.id.beerIngredientsYeastDetails)).setText("");

        ((TextView) getActivity().findViewById(R.id.beerContributedByDetails)).setText(beer.getContibutor());
    }
}
