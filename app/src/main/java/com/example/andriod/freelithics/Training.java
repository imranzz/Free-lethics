package com.example.andriod.freelithics;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Training extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_training, container, false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Strength", "Increase your strength build muscle"));
        words.add(new Word("Conditioning", "Increase your strength endurance and burn fat"));
        words.add(new Word("endurance", "Increase your endurance and burn fat"));
        words.add(new Word("challenges", "Test your fitness"));
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootview.findViewById(R.id.training);

        listView.setAdapter(adapter);

        return rootview;
    }


}
