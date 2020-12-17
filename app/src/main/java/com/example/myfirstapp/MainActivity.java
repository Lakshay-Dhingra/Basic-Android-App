package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickbtn(View view)
    {
        EditText usernameET = (EditText)findViewById(R.id.username);
        String username = usernameET.getText().toString();
        String mymessage = "Hello "+username+"! Welcome to My App.";
        Toast.makeText(getApplicationContext(),mymessage,Toast.LENGTH_LONG).show();
    }
}