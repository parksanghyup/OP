package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MeasureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);
    }
    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void btnClickwaist(View view) {
        if (view.getId() == R.id.waist) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickleg(View view) {
        if (view.getId() == R.id.leg) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickshoulder(View view) {
        if (view.getId() == R.id.shoulder) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }

    public void btnClicklist(View view) {
        if (view.getId() == R.id.category) {
            Intent intent = new Intent(getApplicationContext(), MeasureListActivity.class);
            startActivity(intent);
        }
    }
    public void btnClicksearch(View view) {
        if (view.getId() == R.id.search) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickmeasure(View view) {
        if (view.getId() == R.id.measure) {
            Intent intent = new Intent(getApplicationContext(), CountMeasureActivity.class);
            startActivity(intent);
        }
    }
}
