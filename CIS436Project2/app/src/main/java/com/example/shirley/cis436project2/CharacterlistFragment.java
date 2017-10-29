package com.example.shirley.cis436project2;

/**
 * Created by shirley on 7/5/17.
 */
import android.os.Bundle;
import android.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.content.Intent;
import android.content.res.Configuration;


public class CharacterlistFragment extends Fragment{


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public String[] defalutList= {
            "Warrior",
            "Mage",
            "Healer",
            "Hunter",
            "Paladin"
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main,container,false);

        //init the character list and by id from the activity_main layout
        ListView characterList = (ListView) view.findViewById(R.id.character_list);


        //arraydapter instruction from stackoverflow, bind the string list to array.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, defalutList);

        //Set the Adapter
        characterList.setAdapter(arrayAdapter);

        //set up setonitemListener

        characterList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position== 0)
                {
                    int currentOrientation = getResources().getConfiguration().orientation;
                    if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                        //
                    }
                    else {
                        Intent myIntent = new Intent(getActivity(), WarriorActivity.class);
                        startActivity(myIntent);
                    }

                }

                if (position == 1) {
                    int currentOrientation = getResources().getConfiguration().orientation;
                    if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                        //
                    }
                    else {
                        Intent myIntent = new Intent(getActivity(), MageFragment.class);
                        startActivity(myIntent);
                    }
                }
                if (position == 2) {
                    int currentOrientation = getResources().getConfiguration().orientation;
                    if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                        //
                    }
                    else {
                        Intent myIntent = new Intent(getActivity(), HealerFragment.class);
                        startActivity(myIntent);
                    }
                }

                if (position == 3) {
                    int currentOrientation = getResources().getConfiguration().orientation;
                    if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                        //
                    }
                    else {
                        Intent myIntent = new Intent(getActivity(), HunterFragment.class);
                        startActivity(myIntent);
                    }
                }

                if (position == 4) {
                    int currentOrientation = getResources().getConfiguration().orientation;
                    if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                        //
                    }
                    else {
                        Intent myIntent = new Intent(getActivity(), PaladinFragment.class);
                        startActivity(myIntent);
                    }
                }
            }
        });

        return view;
    }


    //constructor
    public CharacterlistFragment() {}

}
