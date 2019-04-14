package com.tje.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView contentTextView;

    EditText inputEditText;

    Button okBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("메인-onCreate테스트","정말실행되나");
        Log.e("메인-e로그","어떻게 나오나 ");

        contentTextView = findViewById(R.id.contentTextView);
        inputEditText = findViewById(R.id.inputEditText);
        okBtn = findViewById(R.id.okBtn);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("확인버튼","터치 이벤트 발생 했다!");
                /*ctrl +
                * 입력에딧텍스트의 내용을 뽑아서 userInputStr 변수에 저장 (get) */
                 String userInputStr = inputEditText.getText().toString();
                /* 담겨있던 내용을 가져다가 내요 TextVIew 의 text 로 집어넣음 (set)*/
                 contentTextView.setText(userInputStr);
            }
        });


    }
}
