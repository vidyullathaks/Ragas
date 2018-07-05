package com.example.vidyulatha.melakartaragas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(b1);

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(Main3Activity.this,Main5Activity.class);
                startActivity(b2);

            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3 = new Intent(Main3Activity.this,Main6Activity.class);
                startActivity(b3);
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(Main3Activity.this,Main7Activity.class);
                startActivity(b4);
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(Main3Activity.this,Main8Activity.class);
                startActivity(b5);

            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b6 = new Intent(Main3Activity.this,Main9Activity.class);
                startActivity(b6);
            }

        });






    }
}
