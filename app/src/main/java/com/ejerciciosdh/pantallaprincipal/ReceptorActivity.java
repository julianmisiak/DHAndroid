package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ReceptorActivity extends AppCompatActivity {
    public static final String KEY_NOMBRE = "nombre";
    public static final String KEY_APELLIDO = "apellido";
    public static final String KEY_EDAD = "edad";

    @BindView(R.id.txtViewNombreRecibido)
    TextView txtNombre;
    @BindView(R.id.txtViewApellidoRecibido)
    TextView txtApellido;
    @BindView(R.id.txtViewEdadRecibido)
    TextView txtEdad;

    private Unbinder unbinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receptor_activity);
        Intent intent =  getIntent();
        Bundle unBundle = intent.getExtras();
        String nombre = unBundle.getString(KEY_NOMBRE);
        String apellido = unBundle.getString(KEY_APELLIDO);
        String edad = unBundle.getString(KEY_EDAD);

        unbinder = ButterKnife.bind(this);

        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtEdad.setText(edad);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
