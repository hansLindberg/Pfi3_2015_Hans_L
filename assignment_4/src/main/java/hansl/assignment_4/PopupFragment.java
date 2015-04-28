package hansl.assignment_4;


import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopupFragment extends DialogFragment implements View.OnClickListener{


    public PopupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_popup, container, false);

        TextView t1 = (TextView) v.findViewById(R.id.tv_dialog_title);
        TextView t2 = (TextView) v.findViewById(R.id.tv_dialog_description);
        ImageView i = (ImageView) v.findViewById(R.id.iv_dialog);

        v.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        i.setOnClickListener(this);



        return v;
    }

    @Override
    public void onClick(View v){
        PopupFragment.this.dismiss();
    }

}
