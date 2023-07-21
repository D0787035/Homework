package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View view){

        EditText txtusername = findViewById(R.id.etuser);
        EditText txtpassword = findViewById(R.id.etpassword);

        String user = txtusername.getText().toString();
        String password = txtpassword.getText().toString();

        if(user.equals("tku1") && password.equals("1234")){

            Intent intent = new Intent(this, Homepage.class);
            startActivity(intent);
        }
        else{
            String message = "user or password incorrect";
            TextView txv = findViewById(R.id.txtwrong);
            txv.setText(message);
        }


    }
}