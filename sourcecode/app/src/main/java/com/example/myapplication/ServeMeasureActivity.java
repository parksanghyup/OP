 package com.example.myapplication;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;

 import androidx.appcompat.app.AppCompatActivity;

public class ServeMeasureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serve_measure);
    }
    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void btnClicklist(View view) {
        if (view.getId() == R.id.servecategory) {
            Intent intent = new Intent(getApplicationContext(), MeasureListActivity.class);
            startActivity(intent);
        }
    }
    public void btnClicksearch(View view) {
        if (view.getId() == R.id.servesearch) {
            Intent intent = new Intent(getApplicationContext(), ServeMeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickmeasure(View view) {
        if (view.getId() == R.id.servemeasure) {
            Intent intent = new Intent(getApplicationContext(), CountMeasureActivity.class);
            startActivity(intent);
        }
    }

}
