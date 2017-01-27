package com.example.ticlab4.ejercicio_002;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Screen extends AppCompatActivity {
    //Establecer la duracion de la pantalla de inicio
    private static final long SPLAH_SCREEN_DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Aplicar orientacion de la imagen
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Ocultar barra de título
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash__screen);

        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                //Iniciar el MainActivity
                Intent mainIntent = new Intent().setClass(Splash_Screen.this, MainActivity.class);
                startActivity(mainIntent);
                //Se finaliza la actividad
                finish();
            }
        };
        //Simula la carga de un proceso en la aplicación
        Timer timer= new Timer();
        timer.schedule(task, SPLAH_SCREEN_DELAY);
    }
}
