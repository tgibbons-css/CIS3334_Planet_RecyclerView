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

    /***
     *  Constructor --- in the future the data should be moved to a ViewModel and the viewModel should be passed into this constructor
     * @param application
     */
    public PlanetAdapter(Application application) {
        this.context = application;
        //--------------------------------------
        // Initialize the planet list
        // planet data from http://www.enchantedlearning.com/subjects/astronomy/planets/
        planetList.add(new Planet("Mercury", 57.9, 4800));
        planetList.add(new Planet("Venus", 108.2, 12104));
        planetList.add(new Planet("Earth", 149.6, 12700));
        planetList.add(new Planet("Mars", 227.9, 6700));
        planetList.add(new Planet("Jupiter", 778.3, 143000));
        planetList.add(new Planet("Saturn", 1427.0, 120000));
        planetList.add(new Planet("Uranus", 2871.0, 51100));
        planetList.add(new Planet("Neptune", 4497.1, 48600));
        planetList.add(new Planet("Pluto (dwarf)", 5913.0, 2274));
        planetList.add(new Planet("Tatoonie", 99999.9, 11000));
        planetList.add(new Planet("Hoth", 99999.9, 7000));
        planetList.add(new Planet("Naboo", 99999.9, 14000));
        planetList.add(new Planet("Alderaan", 99999.9, 15000));
        planetList.add(new Planet("Dagobah", 99999.9, 11000));
    }

    /***
     *  Set up link to ViewHolder class. This can be an external class or an internal class
     *      - Inflate the XML layout for a row and pass it to the ViewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.planet_row, parent, false);
        PlanetViewHolder holder = new PlanetViewHolder(view);
        return new PlanetViewHolder(view);
    }

    /***
     *  Tie each widget in the ViewHolder to data from the planet list
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet currentPlanet = planetList.get(position);
        holder.textViewPlanetName.setText(currentPlanet.getName());
        holder.textViewPlanetDistance.setText(currentPlanet.getDistanceFromSol().toString());
        holder.textViewPlanetDiameter.setText(currentPlanet.getDiameter().toString());
    }

    /***
     * Require method to return size of the list to determine how to scoll
     * @return
     */
    @Override
    public int getItemCount() {
        return planetList.size();
    }
}