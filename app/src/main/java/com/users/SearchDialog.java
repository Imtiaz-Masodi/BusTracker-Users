package com.users;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchDialog extends DialogFragment {
    MainActivity mActivity;
    EditText source,destination;
    Button getRoute;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mActivity = (MainActivity) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_search_dialog,null);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        source = (EditText) view.findViewById(R.id.etSourceLoc);
        destination = (EditText) view.findViewById(R.id.etDestinationLoc);
        getRoute = (Button) view.findViewById(R.id.bGetRoute);

        getRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String origin = source.getText().toString();
                String destination = SearchDialog.this.destination.getText().toString();
                if (origin.isEmpty()) {
                    Toast.makeText(mActivity, "Please enter origin address!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (destination.isEmpty()) {
                    Toast.makeText(mActivity, "Please enter destination address!", Toast.LENGTH_SHORT).show();
                    return;
                }
                mActivity.getRoute(origin, destination);
            }
        });
        return view;
    }

    interface Communicator {
        void getRoute(String source, String destination);
    }

}
