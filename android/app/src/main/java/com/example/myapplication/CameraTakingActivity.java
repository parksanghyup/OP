package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.graphics.Bitmap;

public class CameraTakingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_taking);

        Intent nextIntent = getIntent();
        Bitmap image = (Bitmap) nextIntent.getParcelableExtra("image");
        ImageView imageFrame = (ImageView) findViewById(R.id.imageView8);
        imageFrame.setImageBitmap(image);
    }

    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void result(View v) {
        Intent intent = new Intent(getApplicationContext(), MeasureResultActivity.class);
        startActivity(intent);
    }
}
