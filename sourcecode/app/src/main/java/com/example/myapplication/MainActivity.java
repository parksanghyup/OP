package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("LineChartActivity1");
        Button btn_finish = (Button)findViewById(R.id.findViewByld);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishAffinity();
                System.runFinalization();
                System.exit(0);
            }
        });

    }

    public void btnClick(View view) {
        if (view.getId() == R.id.pose) {
            Intent intent = new Intent(getApplicationContext(), PoseActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickplan(View view) {
        if (view.getId() == R.id.plan) {
            Intent intent = new Intent(getApplicationContext(), MeasureActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickuser(View view) {
        if (view.getId() == R.id.user) {
            Intent intent = new Intent(getApplicationContext(), UserActivity.class);
            startActivity(intent);
        }
    }


}
