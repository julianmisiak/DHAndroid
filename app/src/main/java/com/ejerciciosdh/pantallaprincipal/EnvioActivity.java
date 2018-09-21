package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class EnvioActivity extends AppCompatActivity {
    public final static String KEY_NOMBRE = "nombre";
    public final static String KEY_APELLIDO = "apellido";
    public final static String KEY_EDAD = "edad";
    public final static String KEY_CARRERA = "carrera";
    public final static String KEY_EMAIL = "email";
    public final static String KEY_CHK_TORNEOS = "chkTorneos";
    public final static String KEY_CHK_MEETUPS = "chkMeetups";
    public final static String KEY_CHK_ASADOS = "chkAsados";

    @BindView(R.id.vtNombre)
    TextView vtNombre;
    @BindView(R.id.vtApellido)
    TextView vtApellido;
    @BindView(R.id.vtEdad)
    TextView vtEdad;
    @BindView(R.id.vtCarrera)
    TextView vtCarrera;
    @BindView(R.id.vtEmail)
    TextView vtEmail;
    @BindView(R.id.chkTorneos)
    CheckBox chkTorneos;
    @BindView(R.id.chkMeetups)
    CheckBox chkMeetups;
    @BindView(R.id.chkAsados)
    CheckBox chkAsados;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.envio_activity);
       unbinder = ButterKnife.bind(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nombre = bundle.getString(KEY_NOMBRE);
        String apellido = bundle.getString(KEY_APELLIDO);
        String edad = bundle.getString(KEY_EDAD);
        String carrera = bundle.getString(KEY_CARRERA);
        String email = bundle.getString(KEY_EMAIL);

        Boolean estaSelecciandoTorneos = bundle.getBoolean(KEY_CHK_TORNEOS);
        Boolean estaSelecciandoMeetups = bundle.getBoolean(KEY_CHK_MEETUPS);
        Boolean estaSelecciandoAsados = bundle.getBoolean(KEY_CHK_ASADOS);

        vtNombre.setText(nombre);
        vtApellido.setText(apellido);
        vtEdad.setText(edad);
        vtCarrera.setText(carrera);
        vtEmail.setText(email);
        chkTorneos.setChecked(estaSelecciandoTorneos);
        chkMeetups.setChecked(estaSelecciandoMeetups);
        chkAsados.setChecked(estaSelecciandoAsados);
    }
}
