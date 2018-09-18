package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.*;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ActividadActivity extends AppCompatActivity {
    @BindView(R.id.btnEnClase)
    Button btnEnClase;
    @BindView(R.id.btnEjercicio1)
    Button btnEjercicio1;
    @BindView(R.id.btnEjercicio2)
    Button btnEjercicio2;
    @BindView(R.id.btnEjercicio3)
    Button btnEjercicio3;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        unbinder = ButterKnife.bind(this);
        btnEnClase.setOnClickListener(listenerBtnEnClase);
        btnEjercicio1.setOnClickListener(listenerEjericicio1);
        btnEjercicio2.setOnClickListener(listenerEjericicio2);
        btnEjercicio3.setOnClickListener(listenerEjericicio3);


    }


    View.OnClickListener listenerBtnEnClase = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), EnClaseActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerEjericicio1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), SenderActivity.class);
            startActivityForResult(intent, 0);

        }
    };


    View.OnClickListener listenerEjericicio2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), Ejer2ActActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerEjericicio3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), Ejer3ActActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
