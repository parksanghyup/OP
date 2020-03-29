package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// 안드로이드 Activity는 화면에 표시되는 UI 구성을 위해 가장 기본이 되는 요소이다..
// 안드로이드 앱은 화면에 UI를 표시하기 위해 최소 하나의 Activity를 가져야 하며, 앱 실행 시 지정된 Activity를 실행하여 사용자에게 UI를 표시하게 된다.
// 프로젝트 생성시 자동생성되는 "MainActivity"가 바로 앱 실행 시 최초로 보여지는 Activity이다. 물론 설정에따라 이름은 변경이 가능하다.

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
