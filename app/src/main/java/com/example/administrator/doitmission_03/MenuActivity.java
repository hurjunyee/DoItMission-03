package com.example.administrator.doitmission_03;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn1 = (Button) findViewById(R.id.btn_gogaek);

        btn2 = (Button) findViewById(R.id.btn_maechul);

        btn3 = (Button) findViewById(R.id.btn_sangpum);
    }

    public void onClick(View v) {
        Intent mIntent = new Intent();

        switch (v.getId()) {
            case R.id.btn_gogaek:
                mIntent.putExtra("clickedName", btn1.getText());
                setResult(Activity.RESULT_OK, mIntent);
                finish();

            case R.id.btn_maechul:
                mIntent.putExtra("clickedName", btn2.getText());
                setResult(Activity.RESULT_OK, mIntent);
                finish();

            case R.id.btn_sangpum:
                mIntent.putExtra("clickedName", btn3.getText());
                setResult(RESULT_OK, mIntent);
                finish();

        }
    }
}
