package css.planets;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cssuser on 2/15/2017.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {

    private List<Planet> planetList = new ArrayList<>();
    private Context context;

    public PlanetAdapter(Application application) {
        this.context = application;
        // planet data from http://www.enchantedlearning.com/subjects/astronomy/planets/
        planetList.add(new Planet("Mercury", 57.9, 4800.0));
        planetList.add(new Planet("Venus", 108.2, 12104.0));
        planetList.add(new Planet("Mars", 227.9, 6787.0));
        planetList.add(new Planet("Jupiter", 227.9, 6787.0));
        planetList.add(new Planet("Saturn", 227.9, 6787.0));
        planetList.add(new Planet("Neptune", 227.9, 6787.0));
        planetList.add(new Planet("Uranus", 227.9, 6787.0));
        //--------------------------------------
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.planet_row, parent, false);
        PlanetViewHolder holder = new PlanetViewHolder(view);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet currentPlanet = planetList.get(position);
        holder.textViewPlanetName.setText(currentPlanet.getName());
        holder.textViewPlanetDistance.setText(currentPlanet.getDistanceFromSol().toString());
        holder.textViewPlanetDiameter.setText(currentPlanet.getDiameter().toString());
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }
}