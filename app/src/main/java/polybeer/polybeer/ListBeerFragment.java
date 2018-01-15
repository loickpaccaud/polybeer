package polybeer.polybeer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import polybeer.polybeer.Object.Beer;

public class ListBeerFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    private void listBeer(){
        String api_url = "https://api.punkapi.com/v2/beers";
        Beer beer = new Beer();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest (Request.Method.GET, api_url, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try{
                            for(int i=0 ; i<response.length(); i++){
                                JSONObject jsonObject = response.getJSONObject(i);
                                int beer_id = jsonObject.getInt("id");
                            }
                        }
                        catch(JSONException e){
                            e.printStackTrace();
                        }
                    }
                });
    }


}


