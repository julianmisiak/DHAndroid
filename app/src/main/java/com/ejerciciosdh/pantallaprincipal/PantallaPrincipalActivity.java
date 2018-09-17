package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.*;

public class PantallaPrincipalActivity extends AppCompatActivity {
    //butterknife
    @BindView(R.id.btnEjercicio1) Button btnEjercicio1;
    @BindView(R.id.btnEjercicio2) Button btnEjercicio2;
    @BindView(R.id.btnEjercicio3) Button btnEjercicio3;
    @BindView(R.id.btnCalculadora) Button btnCalculadora;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal_activity);
        unbinder = ButterKnife.bind(this);

        btnEjercicio1.setOnClickListener(listenerEjericicio1);
        btnEjercicio2.setOnClickListener(listenerEjericicio2);
        btnEjercicio3.setOnClickListener(listenerEjericicio3);
        btnCalculadora.setOnClickListener(listenerCalculadora);
    }


    View.OnClickListener listenerEjericicio1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(), Ejercicio1Activity.class);
            startActivityForResult(intent, 0);

        }
    };


    View.OnClickListener listenerEjericicio2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(), Ejercicio2Activity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerEjericicio3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(), Ejercicio3Activity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerCalculadora= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(), CalculadoraActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
