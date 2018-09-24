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
    @BindView(R.id.btnLoginRegistrer)
    Button btnLoginRegistrer;
    @BindView(R.id.btnEjercicio3)
    Button btnEjercicio3;
    @BindView(R.id.btnReloj)
    Button btnReloj;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        unbinder = ButterKnife.bind(this);
        btnEnClase.setOnClickListener(listenerBtnEnClase);
        btnEjercicio1.setOnClickListener(listenerEjericicio1);
        btnLoginRegistrer.setOnClickListener(listenerLoginRegistrer);
        btnEjercicio3.setOnClickListener(listenerEjericicio3);
        btnReloj.setOnClickListener(listenerReloj);
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


    View.OnClickListener listenerLoginRegistrer = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), LoginRegistrerActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerEjericicio3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), FormularioCompletoActivity.class);
            startActivityForResult(intent, 0);

        }
    };

    View.OnClickListener listenerReloj = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), RelojActivity.class);
            startActivity(intent);

        }
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
