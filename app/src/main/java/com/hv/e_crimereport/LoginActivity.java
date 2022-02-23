package com.hv.e_crimereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button buttonlgn;
    TextView textViewReg;
    TextView forgot_pass;

    EditText user_mob;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        buttonlgn=findViewById(R.id.Loginbutton);
        textViewReg=findViewById(R.id.textReg);
        forgot_pass=findViewById(R.id.forgot_pass);

        user_mob=findViewById(R.id.user_mob);
        password=findViewById(R.id.pass);

        buttonlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        textViewReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent2);
            }
        });

        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(LoginActivity.this,ForgotPassword.class);
                startActivity(intent3);
            }
        });




    }
}