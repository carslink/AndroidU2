package com.example.ticlab4.ejercicio_002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView bajoPeso;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Relacion de objetos

        bajoPeso=(TextView)findViewById(R.id.bajopeso);
        imagen=(ImageView)findViewById(R.id.image);

    }
}
