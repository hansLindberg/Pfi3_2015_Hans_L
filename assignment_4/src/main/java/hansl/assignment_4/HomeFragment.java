package hansl.assignment_4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Hans on 2015-04-23.
 */
public class HomeFragment extends Fragment implements AdapterView.OnItemClickListener {

    public static ArrayList<Planet> planets = new ArrayList<Planet>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        planets.clear();
        Drawable d = getResources().getDrawable(R.drawable.earth);
        planets.add(new Planet(getResources().getString(R.string.earth_name),d,getResources().getString(R.string.earthInfo)));
        d = getResources().getDrawable(R.drawable.mars);
        planets.add(new Planet(getResources().getString(R.string.mars_name),d,getResources().getString(R.string.marsInfo)));
        d = getResources().getDrawable(R.drawable.jupiter);
        planets.add(new Planet(getResources().getString(R.string.jupiter_name),d,getResources().getString(R.string.jupiterInfo)));
        d = getResources().getDrawable(R.drawable.mercury);
        planets.add(new Planet(getResources().getString(R.string.mercury_name),d,getResources().getString(R.string.mercuryInfo)));
        d = getResources().getDrawable(R.drawable.neptune);
        planets.add(new Planet(getResources().getString(R.string.neptune_name),d,getResources().getString(R.string.neptuneInfo)));
        d = getResources().getDrawable(R.drawable.saturn);
        planets.add(new Planet(getResources().getString(R.string.saturn_name),d, getResources().getString(R.string.saturnInfo)));
        d = getResources().getDrawable(R.drawable.uranus);
        planets.add(new Planet(getResources().getString(R.string.uranus_name),d,getResources().getString(R.string.uranusInfo)));
        d = getResources().getDrawable(R.drawable.venus);
        planets.add(new Planet(getResources().getString(R.string.venus_name),d,getResources().getString(R.string.venusInfo)));

        for (int i = 0; i < planets.size(); i++) {
            Log.i("planets", planets.get(i).getName());
        }

    }
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        Log.i("onCreateView","started");
        final View v = inflater.inflate(R.layout.fragment_main, container, false);
        GridView gridview = (GridView) v.findViewById(R.id.gridview1);

        gridview.setAdapter(new ImageAdapter(getActivity(), planets));

        gridview.setOnItemClickListener(this);
        Log.i("onCreateView", "ended");
        return v;
            }

    @Override
    public void onItemClick(AdapterView<?> parent, View v,
                            int position, long id) {

        InfoFragment iF = new InfoFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("planet",planets.get(position));
        iF.setArguments(bundle);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, iF);
        ft.addToBackStack(null);
        Log.i("BackStack","true");
        ft.commit();

    }

}
