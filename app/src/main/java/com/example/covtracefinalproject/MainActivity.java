package com.example.covtracefinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageView editlogo;
    TextView edittext1;
    TextView edittext2;
    Button btnSave;
    SharedPreferences sharedpref;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editlogo=(ImageView) findViewById(R.id.editlogo);
        edittext1=(TextView) findViewById(R.id.edittext1);
        edittext2=(TextView) findViewById(R.id.edittext2);
        btnSave=(Button) findViewById(R.id.btnsave);
        sharedpref=getSharedPreferences("My data", Context.MODE_PRIVATE);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(MainActivity.this, cov.class);
                startActivity(registerScreen);

            }
        });
    }
}