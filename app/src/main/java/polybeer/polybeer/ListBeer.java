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

public class ListBeer extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    private void listBeer(){
        String api_url = "https://api.punkapi.com/v2/beers";
        Beer beer = new Beer(1,
                "Buzz",
                "A Real Bitter Experience.",
                "09/2007",
                "A light, crisp and bitter IPA brewed with English and American hops. A small batch brewed only once.",
                "https://images.punkapi.com/v2/keg.png",
                4.5,
                60,
                1010,
                1044,
                20,
                10,
                4.4,
                75,
                20,
                25,
                75,
                64,
                19,
                "",
                "Maris Otter Extra Pale\\n Caramalt \\n Munich";
                "Fuggles \\n First Gold \\n Fuggles \\n First Gold \\n Cascade",
                "Wyeast 1056 - American Ale™",
                "Spicy chicken tikka masala \\n Grilled chicken quesadilla \\n Caramel toffee cake",
                "The earthy and floral aromas from the hops can be overpowering. Drop a little Cascade in at the end of the boil to lift the profile with a bit of citrus.",
                "Sam Mason <samjbmason>");

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest
                (Request.Method.GET, api_url, null, new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {
                        try{
                            //todo
                        }
                        catch(JSONException e){
                            e.printStackTrace();
                        }
                    }
                }
    }


}


