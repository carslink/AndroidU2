package com.example.ticlab4.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView sobrepeso;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //Relacion de objetos

        sobrepeso=(TextView)findViewById(R.id.sobrepeso);
        imagen=(ImageView)findViewById(R.id.image3);
    }
}
