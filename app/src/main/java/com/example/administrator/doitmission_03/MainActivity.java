package com.example.administrator.doitmission_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_MENU = 1001;

    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivityForResult(mIntent, REQUEST_CODE_MENU);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String buttonName;

        if(requestCode == REQUEST_CODE_MENU) {
            if(resultCode == RESULT_OK) {
                buttonName = data.getStringExtra("clickedName");
                Toast.makeText(getApplicationContext(), buttonName, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
