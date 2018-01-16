package polybeer.polybeer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.beerList);

        if(listView != null){
            listView.setOnItemClickListener(this);
            if(savedInstanceState != null){
                return;
            }
        }

        ListBeerFragment listBeerFragment = new ListBeerFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.mainFragment,listBeerFragment).commit();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        System.out.println(position);
        System.out.println(id);
    }

}