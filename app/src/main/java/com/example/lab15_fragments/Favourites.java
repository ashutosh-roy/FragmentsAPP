package com.example.lab15_fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Favourites extends Fragment {

    TextView txtData;
    public Favourites() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_favourites, container, false);
        return v;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtData = (TextView)view.findViewById(R.id.textView2);
    }

    protected void displayReceivedData(String message)
    {
        Toast.makeText(getActivity(),"LOVELY THOUGHTS,SWIPE TO VIEW",Toast.LENGTH_SHORT).show();
        txtData.setText(message);
    }


}