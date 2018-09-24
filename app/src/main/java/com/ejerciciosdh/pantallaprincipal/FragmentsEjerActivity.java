package com.ejerciciosdh.pantallaprincipal;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class FragmentsEjerActivity extends AppCompatActivity {
    RojoFragment rojoFragment = new RojoFragment();
    VerdeFragment verdeFragment = new VerdeFragment();
    Button btnRojo;
    Button btnVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_ejer);
        btnRojo = findViewById(R.id.btnRojo);
        btnVerde = findViewById(R.id.btnVerde);

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment,rojoFragment);
                ft.commit();
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment, verdeFragment);
                ft.commit();
            }
        });
    }
}
