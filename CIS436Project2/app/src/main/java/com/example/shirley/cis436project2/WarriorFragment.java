package com.example.shirley.cis436project2;

/**
 * Created by shirley on 7/6/17.
 */

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WarriorFragment extends PreferenceFragment
        implements OnSharedPreferenceChangeListener {

    private SharedPreferences prefs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
    }

    @Override
    public void onResume() {
        super.onResume();
        prefs.registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onPause() {
        prefs.unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences prefs,
                                          String key) {
        WarriorFragment tipFragment =
                (WarriorFragment) getFragmentManager()
                        .findFragmentById(R.id.rating_fragment);
        if (tipFragment != null) {
            tipFragment.onResume();
        }

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.warriorrating,
                container, false);

        TextView  StrengthView= (TextView) view.findViewById(R.id.StrengthView);
//        percentUpButton = (Button) view.findViewById(R.id.percentUpButton);
//        percentDownButton = (Button) view.findViewById(R.id.percentDownButton);
//        tipTextView = (TextView) view.findViewById(R.id.tipTextView);
//        totalTextView = (TextView) view.findViewById(R.id.totalTextView);
//
//        // set the listeners
//        billAmountEditText.setOnEditorActionListener(this);
//        percentUpButton.setOnClickListener(this);
//        percentDownButton.setOnClickListener(this);

        // return the View for the layout
        return view;
    }
}