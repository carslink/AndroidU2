package com.example.ticlab4.ejercicio_002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtPeso, txtEstatura;
    CheckBox chEjercicio;
    RadioButton rdHombre, rdMujer;
    TextView txtResul;
    Button btnCalcular;
    Button btnLimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se relacionan los objetos del xml
        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtPeso=(EditText)findViewById(R.id.txtPeso);
        txtEstatura=(EditText)findViewById(R.id.txtEstatura);
        chEjercicio=(CheckBox) findViewById(R.id.chEjercicio);
        rdHombre=(RadioButton) findViewById(R.id.rdHombre);
        txtResul=(TextView) findViewById(R.id.txtResultado);
        btnCalcular=(Button) findViewById(R.id.btnCalcular);
        btnLimpiar=(Button) findViewById(R.id.btnLimpiar);

        //Asosiar escucha al boton para el evento Click


        btnCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Persona p = new Persona();//Objeto de la clase persona
                p.setNombre(txtNombre.getText().toString());
                p.setPeso(Double.parseDouble(txtPeso.getText().toString()));
                p.setEstatura(Double.parseDouble(txtEstatura.getText().toString()));
                if (chEjercicio.isChecked()) {
                    p.setEjercicio((byte) 1);
                } else {
                    p.setEjercicio((byte) 0);
                }
                if (rdHombre.isChecked()) {
                    p.setSexo('H');
                } else if (rdMujer.isChecked()) {
                    p.setSexo('M');
                } else {
                    p.setSexo('X');
                }
                p.calcularImc();
                p.estate();

                txtResul.setText(p.toString());

                if (p.images() < 20) {
                    Intent bajopeso = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(bajopeso);
                }else
                if (p.images()>=20 && p.images()<=25){
                    Intent normal = new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(normal);
                }else
                if (p.images()>25){
                    Intent sobrepeso = new Intent(MainActivity.this,Main4Activity.class);
                    startActivity(sobrepeso);
                }
                


            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtEstatura.setText("");
                txtPeso.setText("");
                chEjercicio.setChecked(false);
                rdHombre.setChecked(false);
                rdMujer.setChecked(false);
                txtResul.setText("");
            }
            });

}
    }