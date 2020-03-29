package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// Java 코드에 사용되는 라이브러리들을 가져온 것이다.
// C 언어의 #include와 맥락이 비슷하다.

public class MainActivity extends AppCompatActivity {
    // 위젯 버튼이 4개이므로 버튼 4개 변수를 만든다.
    // 이 버튼 클래스는 라이브러리 widget.Button이 필요하다.

    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // 앱과 함께 실행되는 메서드
        super.onCreate(savedInstanceState);
        // 앱에 xml 뷰를 표시해준다.
        setContentView(R.layout.activity_main);

        // 각 버튼을 xml의 android:id 에 해당하는 이름들과 짝지어준다.
        // * 위에서 선언한 button1과 R.id.button1은 다른 것이다.
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        // 클릭과 터치에 관여하는 리스너이다.
        // 구현하는 법은 여러가지가 있지만 아래의 방법은 Java 코드로 사용자의 동작을 정의하고
        // 이후에 앱의 반응을 프로그래밍한 것입니다.
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            // onClick 은 클릭과 터치에 반응하는 순간을 의미하며,
            // Uri 는 다양하게 사용되는 변수로 일반 변수보다 보안성, 사용 장점면에서 채택하여
            // 사용하고 있습니다. Intent action_view는 다른 작업으로 넘어가는 것을 정의합니다.
            // Intent는 어떤 작업을 담고 있으며, startAcitivity 즉, Acitivity로 넘어가면서 그 작업을 실행합니다.
            public void onClick(View view) {
                Uri webPage = Uri.parse("http://www.google.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(webIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            // action dial 은 전화와 관련이 있습니다. 전화와 관련된 작업을 실행합니다.
            public void onClick(View view) {
                Uri number = Uri.parse("tel:119");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri galApp = Uri.parse("content://media/internal/images/media");
                Intent galIntent = new Intent(Intent.ACTION_VIEW, galApp);
                startActivity(galIntent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            // finish 는 앱을 종료하는 함수입니다.
            public void onClick(View view) {
                finish();
            }
        });
    }
}
