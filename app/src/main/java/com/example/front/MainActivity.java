package com.example.front;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView T;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T=(TextView)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);

    }
}
