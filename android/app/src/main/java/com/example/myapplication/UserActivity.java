package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void onbuttontosetting(View v) {
        Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
        startActivity(intent);
    }
    public void btnClickkcal(View view) {
        if (view.getId() == R.id.kcal) {
            Intent intent = new Intent(getApplicationContext(), LatelyActivity.class);
            startActivity(intent);
        }
    }
    public void btnClicklately(View view) {
        if (view.getId() == R.id.lately) {
            Intent intent = new Intent(getApplicationContext(), LatelyActivity.class);
            startActivity(intent);
        }
    }
    public void btnClickaltogether(View view) {
        if (view.getId() == R.id.altogether) {
            Intent intent = new Intent(getApplicationContext(), AltogetherActivity.class);
            startActivity(intent);
        }
    }
}
