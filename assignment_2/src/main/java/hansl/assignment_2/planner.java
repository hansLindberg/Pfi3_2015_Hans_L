package hansl.assignment_2;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class Planner extends Fragment implements View.OnClickListener {


    public Planner() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planner, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
