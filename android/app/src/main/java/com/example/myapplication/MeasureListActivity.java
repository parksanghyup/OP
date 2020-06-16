package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MeasureListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_list);
    }
    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void btnClicklist(View view) {
        if (view.getId() == R.id.listcategory) {
            Intent intent = new Intent(getApplicationContext(), MeasureListActivity.class);
            startActivity(intent);
        }
    }
    public void btnClicksearch(View view) {
        if (view.getId() == R.id.listsearch) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickmeasure(View view) {
        if (view.getId() == R.id.listmeasure) {
            Intent intent = new Intent(getApplicationContext(), CountMeasureActivity.class);
            startActivity(intent);
        }
    }
}
