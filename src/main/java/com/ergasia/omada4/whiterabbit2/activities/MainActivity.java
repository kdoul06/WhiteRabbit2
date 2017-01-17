package com.ergasia.omada4.whiterabbit2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ergasia.omada4.whiterabbit2.R;
import com.ergasia.omada4.whiterabbit2.models.Poi;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("poi");


        Poi poi = new Poi( "1",2,3,"1","cat1");
        myRef.child("111").setValue(poi);

        poi  = new Poi( "1",2,3,"1","cat2");
        myRef.child("222").setValue(poi);








    }



}
