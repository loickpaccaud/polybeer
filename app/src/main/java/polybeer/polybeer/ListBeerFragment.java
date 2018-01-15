package polybeer.polybeer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import polybeer.polybeer.Object.Beer;

public class ListBeerFragment extends Fragment {

    private ListView listView;
    private List<Beer> beerList;

    private BeerAdapter beerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_beer_activity, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        beerList = new ArrayList<Beer>();
        this.listView = (ListView) getActivity().findViewById(R.id.beerList);

        listBeer();
    }

    private void listBeer(){
        final String api_url = "https://api.punkapi.com/v2/beers";
        final Context context = getActivity().getApplicationContext();
        RequestQueue queue = Volley.newRequestQueue(context);
        final Beer beer = new Beer();
        beerList = new ArrayList<>();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest (api_url, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                try{
                    for(int i=0 ; i<response.length(); i++){
                        JSONObject jsonObject = response.getJSONObject(i);
                        int id = jsonObject.getInt("id");
                        String name = jsonObject.getString("name");
                        String tagline = jsonObject.getString("tagline");
                        String first_brewed = jsonObject.getString("first_brewed");
                        String description = jsonObject.getString("description");
                        String image_url = jsonObject.getString("image_url");
                        Double abv = jsonObject.getDouble("abv");
                        Double ibu = jsonObject.getDouble("ibu");
                        Double target_fg = jsonObject.getDouble("target_fg");
                        Double target_og = jsonObject.getDouble("target_og");
                        Double ebc = jsonObject.getDouble("ebc");
                        Double srm = jsonObject.getDouble("srm");
                        Double ph = jsonObject.getDouble("ph");
                        Double attenuation_level = jsonObject.getDouble("attenuation_level");

                        JSONArray jsonIngredientMalt = jsonObject.getJSONObject("ingredient").getJSONArray("malt");
                        String ingedients_malt = new String("");
                        for(int k=0 ; k<jsonIngredientMalt.length(); k++) {
                            ingedients_malt += jsonIngredientMalt.getJSONObject(k).getString("name") + "\n";
                        }
                        ingedients_malt = ingedients_malt.substring(0, ingedients_malt.length()-2);

                        JSONArray jsonIngredientHops = jsonObject.getJSONObject("ingredient").getJSONArray("hops");
                        String ingedients_hops = new String("");
                        for(int k=0 ; k<jsonIngredientHops.length(); k++) {
                            ingedients_hops += jsonIngredientHops.getJSONObject(k).getString("name") + "\n";
                        }
                        ingedients_hops = ingedients_hops.substring(0, ingedients_hops.length()-2);

                        String ingedients_yeast = jsonObject.getString("ingedients_yeast");
                        String brewers_tips = jsonObject.getString("brewers_tips");
                        String contibutor = jsonObject.getString("contibutor");

                        beerList.add(new Beer(id,name,tagline,first_brewed,description,image_url,abv,ibu,target_fg,target_og,ebc,srm,ph,attenuation_level,ingedients_malt,ingedients_hops,ingedients_yeast,brewers_tips,contibutor));
                    }
                }
                catch(JSONException e){
                    e.printStackTrace();
                    beerList.add(beer);
                }

                beerAdapter = new BeerAdapter(context, beerList);
                listView.setAdapter(beerAdapter);

            }
        }, null);
        queue.add(jsonArrayRequest);
    }
}


