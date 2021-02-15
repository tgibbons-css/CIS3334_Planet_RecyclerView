package css.planets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewPlanets;
    TextView tvDisplayItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------------------------------
        tvDisplayItem = (TextView) findViewById(R.id.textViewDisplayItem);
        //--------------------------------------
        recyclerViewPlanets = (RecyclerView) findViewById(R.id.recyclerViewPlanets);
        PlanetAdapter adapter = new PlanetAdapter(getApplication());
        recyclerViewPlanets.setAdapter(adapter);
        recyclerViewPlanets.setLayoutManager(new LinearLayoutManager(this));
    }
}