package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pose);
    }
    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void btnClickwaist(View view) {
        if (view.getId() == R.id.posewaist) {
            Intent intent = new Intent(getApplicationContext(), SubPoseActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickleg(View view) {
        if (view.getId() == R.id.poseleg) {
            Intent intent = new Intent(getApplicationContext(), SubPoseActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickshoulder(View view) {
        if (view.getId() == R.id.poseshoulder) {
            Intent intent = new Intent(getApplicationContext(), SubPoseActivity.class);
            startActivity(intent);
        }
    }
}
