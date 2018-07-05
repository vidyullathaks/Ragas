package com.example.vidyulatha.melakartaragas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button cm1;
    Button cm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cm1 = (Button)findViewById(R.id.btn1);
        cm2= (Button)findViewById(R.id.btn2);


        cm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(next);


            }
        });

        cm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
