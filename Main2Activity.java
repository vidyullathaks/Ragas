package com.example.vidyulatha.melakartaragas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText un;
    EditText pass;
    Button si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        un = (EditText)findViewById(R.id.usn);
        pass = (EditText)findViewById(R.id.pass);
        si = (Button)findViewById(R.id.sign_btn);

        final String username = un.getText().toString();




        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = pass.getText().toString().trim();

                if(password=="melakarta"){
                    Intent chakra = new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(chakra);
                }else{
                    Intent chakra = new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(chakra);                }



            }
        });

    }
}
