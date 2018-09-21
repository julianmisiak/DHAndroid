package com.ejerciciosdh.pantallaprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.BindView;

public class EnvioActivity extends AppCompatActivity {
    public  final static  String KEY_NOMBRE = "nombre";
    public  final static  String KEY_APELLIDO = "apellido";
    public  final static  String KEY_EDAD = "edad";
    public  final static  String KEY_CARRERA = "carrera";
    public  final static  String KEY_EMAIL = "email";

    @BindView(R.id.vtNombre)
    TextView etNombre;
    @BindView(R.id.vtApellido)
    TextView etApellido;
    @BindView(R.id.vtEdad)
    TextView etEdad;
    @BindView(R.id.vtCarrera)
    TextView etCarrera;
    @BindView(R.id.vtEdad)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.envio_activity);
    }
}
