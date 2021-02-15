package css.planets;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanetViewHolder extends RecyclerView.ViewHolder{

    TextView textViewPlanetName, textViewPlanetDistance, textViewPlanetDiameter;

    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPlanetName = (TextView) itemView.findViewById(R.id.textViewPlanetName);
        textViewPlanetDistance = (TextView) itemView.findViewById(R.id.textViewPlanetDistance);
        textViewPlanetDiameter = (TextView) itemView.findViewById(R.id.textViewPlanetDiameter);

    }
}
