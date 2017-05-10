package com.example.prades.board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText login_id, login_pw;
    Button login_b;

    TextView t = (TextView)findViewById(R.id.login_alarm);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        login_id = (EditText)findViewById(R.id.login_id);
        login_pw = (EditText)findViewById(R.id.login_password);
        login_b = (Button)findViewById(R.id.login_button);
        login_b.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                t.setText("");
                if(login_id.getText().toString()=="123") {
                    if(login_pw.getText().toString()=="321") {
                        Intent intent = new Intent(MainActivity.this, searchActivity.class);
                        startActivity(intent);
                    }else {
                        t.setText("wrong password!");
                    }
                } else {
                    t.setText("wrong id!");
                }
            }
        });
    }
}
