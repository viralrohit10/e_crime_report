package com.hv.e_crimereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText user_mob;
    EditText password1;
    EditText password2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        textView=findViewById(R.id.textlogin);
        button=findViewById(R.id.buttonlogin);

        user_mob=findViewById(R.id.user_mob);
        password1=findViewById(R.id.pass);
        password2=findViewById(R.id.pass2);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent2);
            }
        });

    }


}