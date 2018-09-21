package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FormularioActivity extends AppCompatActivity {
    @BindView(R.id.etNombre)
    EditText etNombre;
    @BindView(R.id.etApellido)
    EditText etApellido;
    @BindView(R.id.etEdad)
    EditText etEdad;
    @BindView(R.id.etCarrera)
    EditText etCarrera;
    @BindView(R.id.etEmail)
    EditText etEmail;

    @BindView(R.id.btnEnviar)
    EditText btnEnviar;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_activity);
        unbinder = ButterKnife.bind(this);
        validarCamposVacios();
        validarNombreApellido();
        validarEdad();
        validarCarrera();

    }

    private void validarCamposVacios() {
        Boolean estaVacioEtNombre = etNombre.getText().toString().isEmpty();
        Boolean estaVacioEtApellido = etApellido.getText().toString().isEmpty();
        Boolean estaVacioEtEdad = etEdad.getText().toString().isEmpty();
        Boolean estaVacioEtCarrera = etCarrera.getText().toString().isEmpty();
        Boolean estaVacioEtEmail = etEmail.getText().toString().isEmpty();

        if (!(estaVacioEtNombre && estaVacioEtApellido && estaVacioEtEdad && estaVacioEtCarrera && estaVacioEtEmail))
        {
            String mendajeCuerpo = "Complete los siguientes campos: ";
            String mensajeCampos = "";
            mensajeCampos += (estaVacioEtNombre ? "Nombre" : "");
            mensajeCampos += (estaVacioEtApellido ? "Apellido" : "");
            mensajeCampos += (estaVacioEtEdad ? "Edad" : "");
            mensajeCampos += (estaVacioEtCarrera ? "Carrera" : "");
            mensajeCampos += (estaVacioEtEmail ? "Email" : "");

            Toast.makeText(getApplicationContext(), mendajeCuerpo + mensajeCampos, Toast.LENGTH_LONG).show();
        }
    }


    private void validarNombreApellido (){
        Boolean tamMayorDosEtNombre = etNombre.getText().toString().length() >= 2;
        Boolean tamMayorDosEtApellido = etApellido.getText().toString().length() >= 2;

        if(!(tamMayorDosEtNombre && tamMayorDosEtApellido)){
            String mendajeCuerpo = "Los siguientes campos deben estar conformados por al menos dos caracteres: ";
            String mensajeCampos = "";
            mensajeCampos += (tamMayorDosEtNombre ? "Nombre" : "");
            mensajeCampos += (tamMayorDosEtApellido ? "Apellido" : "");

            Toast.makeText(getApplicationContext(), mendajeCuerpo + mensajeCampos, Toast.LENGTH_LONG).show();
        }
    }

    private void validarEdad (){
        if(Integer.parseInt(etEdad.getText().toString()) >= 7 && Integer.parseInt(etEdad.getText().toString()) <=100){
            String mensaje = " La edad solo debe permitir números, y el número ingresado debe estar entre 7 y 100 años";
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    private void validarCarrera (){
        if(etCarrera.getText().toString().length() >= 5){
            String mensaje = "El campo “Carrera” debe contener más de 5 letras";
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    View.OnClickListener enviarListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), EnvioActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
