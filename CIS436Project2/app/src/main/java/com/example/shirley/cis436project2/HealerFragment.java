package com.example.shirley.cis436project2;

/**
 * Created by shirley on 7/6/17.
 */

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class HealerFragment extends Activity implements RatingBar.OnRatingBarChangeListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.healerrating);
        starpoints = getSharedPreferences("starpoints", MODE_PRIVATE);

        RatingBar strength_ratingbar = (RatingBar)findViewById(R.id.Strength_ratingBar);
        strength_ratingbar.setOnRatingBarChangeListener(this);

        RatingBar intelligence_ratingbar = (RatingBar)findViewById(R.id.intellect_ratingBar);
        intelligence_ratingbar.setOnRatingBarChangeListener(this);

        RatingBar wisdom_ratingbar = (RatingBar)findViewById(R.id.wisdom_ratingBar);
        wisdom_ratingbar.setOnRatingBarChangeListener(this);

        RatingBar dexterity_ratingbar= (RatingBar)findViewById(R.id.dexterity_ratingBar);
        dexterity_ratingbar.setOnRatingBarChangeListener(this);

        strength_ratingbar.setRating(strength);
        intelligence_ratingbar.setRating(intelligence);
        wisdom_ratingbar.setRating(wisdom);
        dexterity_ratingbar.setRating(dexterity);


//        points = points - strength - intelligence - wisdom - dexterity;

        TextView pointsview= (TextView)findViewById(R.id.pointsView);
        pointsview.setText(Float.toString(points));


    }


    public void onRatingChanged(RatingBar bar, float rating, boolean fromUser){

        //strensght if conditions
        if (bar.toString().contains("Strength") && (rating > strength)){
            strength = rating;
            points = points - strength;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }
        if (bar.toString().contains("Strength") && (rating < strength)){
            float temp = strength-rating;
            strength = strength- temp;
            points += temp;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));
        }

        //intelligence
        if (bar.toString().contains("intellect") && (rating > intelligence)){
            intelligence= rating;
            points = points - intelligence;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }
        if (bar.toString().contains("intellect") && (rating < intelligence)){
            float temp = intelligence-rating;
            intelligence = intelligence - temp;
            points += temp;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }

        if (bar.toString().contains("wisdom") && (rating > wisdom)){
            wisdom = rating;
            points = points - wisdom;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }
        if (bar.toString().contains("wisdom") && (rating < wisdom)){
            float temp = wisdom-rating;
            wisdom = wisdom- temp;
            points += temp;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }


        if (bar.toString().contains("dexterity") && (rating > dexterity)){
            dexterity= rating;
            points = points - dexterity;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));

        }
        if (bar.toString().contains("dexterity") && (rating < dexterity)){
            float temp = dexterity-rating;
            dexterity = dexterity- temp;
            points += temp;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));


        }


        if (points < 0) {  // if 10 stars have been used, set the textview value back to 0 and error message
            points = 0;
            TextView pointsview= (TextView)findViewById(R.id.pointsView);
            pointsview.setText(Float.toString(points));
            Toast.makeText(this,"YOU don't have enough points",Toast.LENGTH_SHORT).show();
        }
    }

    SharedPreferences starpoints;
    float points = 10; //initialte 10 points pre character.

    //initiate the rating bars
    float strength = 0;
    float intelligence = 0;
    float wisdom = 0;
    float dexterity = 0;

}

