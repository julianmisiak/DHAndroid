package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class FormularioCompletoActivity extends AppCompatActivity {
   private Button btnComenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_completo_activity);
        btnComenzar = findViewById(R.id.btnComenzar);
        btnComenzar.setOnClickListener(comenzarListener);
    }

   View.OnClickListener comenzarListener = new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent = new Intent(getApplicationContext(), FormularioActivity.class);
           startActivity(intent);
       }
   };
}
