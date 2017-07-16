package com.example.andriod.freelithics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class LearnTheMovements extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
       View rootview= inflater.inflate(R.layout.fragment_learn_the_movements, container, false);

        Button back_squat = (Button) (TextView) rootview.findViewById(R.id.back_squat);

        if (back_squat != null) {
            back_squat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent menuIntent = new Intent(getActivity().getApplicationContext(), BackSquatActivity.class);
                    startActivity(menuIntent);
                }
            });
        }

        Button deadlift = (Button) (TextView) rootview.findViewById(R.id.deadlift);

        if (deadlift != null) {
            deadlift.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent menuIntent = new Intent(getActivity().getApplicationContext(), DeadliftActivity.class);
                    startActivity(menuIntent);
                }
            });
        }
        return rootview;
    }






}
