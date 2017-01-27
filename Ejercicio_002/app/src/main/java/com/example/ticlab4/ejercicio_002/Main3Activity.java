package com.example.ticlab4.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView normal;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //Relacion de objetos

        normal=(TextView)findViewById(R.id.normal);
        imagen=(ImageView)findViewById(R.id.image2);
    }
}
