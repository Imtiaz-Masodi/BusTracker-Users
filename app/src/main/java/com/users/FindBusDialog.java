package com.users;


import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class FindBusDialog extends DialogFragment {

    String busno;
    EditText busNo;
    Button searchBus;
    MainActivity mainActivity;

    public FindBusDialog() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mainActivity = (MainActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.find_bus_dialog, null);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        busNo = (EditText) view.findViewById(R.id.etBusNo);
        searchBus = (Button) view.findViewById(R.id.bSearchBus);
        searchBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                busno = busNo.getText().toString().trim();
                if (busno != null) {
                    mainActivity.getBus(busno);
                }
            }
        });
        return  view;
    }

    interface FindBus {
        void getBus(String busno);
    }

}
