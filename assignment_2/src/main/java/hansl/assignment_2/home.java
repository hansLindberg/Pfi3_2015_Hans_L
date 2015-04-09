package hansl.assignment_2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Home extends Fragment implements View.OnClickListener {


    public Home() {
        // Required empty public constructor
        Log.i("Home","created");
    }





    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle
            savedInstanceState) {

        Log.i("Home", "onCreateView");

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main,
                container, false);

        View button = view.findViewById(R.id.search_btn);
        button.setOnClickListener(this);
        Log.i("button","created");


        return view;
    }

   @Override
   public void onClick(View v) {
       Log.i("onclick","clicked");
        MainActivity a = (MainActivity) getActivity();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Planner p = new Planner();
        ft.replace(R.id.container,p);
        ft.addToBackStack(null);
        ft.commit();
    }
}
