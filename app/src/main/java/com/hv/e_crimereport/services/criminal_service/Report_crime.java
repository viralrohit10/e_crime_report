package com.hv.e_crimereport.services.criminal_service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hv.e_crimereport.R;

public class Report_crime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_crime);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Report Crime");
    }
}