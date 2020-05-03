package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class StartMeasureActivity extends AppCompatActivity {




    final static int TAKE_PICTURE = 1;
    private static final String TAG = "measure";
    private CameraTakingActivity cameraTakingActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_measure);

    }

    static final int PERMISSIONS_REQUEST_CODE = 1000;
    String[] PERMISSIONS  = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};

    private boolean hasPermissions(String[] permissions) {
        int result;

        //스트링 배열에 있는 퍼미션들의 허가 상태 여부 확인
        for (String perms : permissions){

            result = ContextCompat.checkSelfPermission(this, perms);

            if (result == PackageManager.PERMISSION_DENIED){
                //허가 안된 퍼미션 발견
                return false;
            }
        }

        //모든 퍼미션이 허가되었음
        return true;
    }

    public void onbuttontomain(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void btnClickTaking(View view) {

        if (view.getId() == R.id.camera) {
//            Intent intent = new Intent(getApplicationContext(), CameraTakingActivity.class);
//            startActivity(intent);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                //퍼미션 상태 확인
                if (!hasPermissions(PERMISSIONS)) {
                    //퍼미션 허가 안되어있다면 사용자에게 요청
                    requestPermissions(PERMISSIONS, PERMISSIONS_REQUEST_CODE);
                }else{
                    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, TAKE_PICTURE);
                }
            }
           // captureCamera();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PICTURE && resultCode == RESULT_OK && data.hasExtra("data")) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            if (bitmap != null) {

                Log.d(TAG,bitmap.getClass().getName());
                ImageView imageFrame = (ImageView) findViewById(R.id.imageView7);
                imageFrame.setImageBitmap(bitmap);
                Intent nextIntent = new Intent(getApplicationContext(), CameraTakingActivity.class);
                nextIntent.putExtra("image", bitmap);
                startActivity(nextIntent);
            } else {
                finish();
            }
        }
    }
}
