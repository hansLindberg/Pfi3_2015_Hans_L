package hansl.assignment_4;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment implements View.OnClickListener{



    public InfoFragment() {
        // Required empty public constructor

    }



    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Planet planet = (Planet)getArguments().getSerializable("planet");

        // Inflate the layout for this fragment
        Log.i("infoFragment", "started");
        View v = inflater.inflate(R.layout.fragment_info, container, false);

        ImageView i = (ImageView) v.findViewById(R.id.planetFactImage);
        i.setImageDrawable(planet.getImage());

        TextView t1 = (TextView) v.findViewById(R.id.factTitle);
        t1.setText(planet.getName());

        TextView t2 = (TextView) v.findViewById(R.id.factDescription);
        t2.setText(planet.getInfo());

        Log.i("infoFragment","ended");

        return v;
    }

    @Override
    public void onClick(View v){

    }


}
