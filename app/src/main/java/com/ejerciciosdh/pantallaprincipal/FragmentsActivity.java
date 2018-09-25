package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class FragmentsActivity extends AppCompatActivity {
    private Button btnEjerFragment;
    private Button btnFragmentsEjer2;
    private NombreTostadaFragment nombreTostadaFragment = new NombreTostadaFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        btnEjerFragment = findViewById(R.id.btnFragmentsEjer);
        btnEjerFragment.setOnClickListener(listenerEjerFragment);

        btnFragmentsEjer2 = findViewById(R.id.btnFragmentsEjer2);
        btnFragmentsEjer2.setOnClickListener(listenerEjer2Fragment);
    }


    View.OnClickListener listenerEjerFragment = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), FragmentsEjerActivity.class);
            startActivity(intent);
        }
    };


    View.OnClickListener listenerEjer2Fragment = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.fragmentTostada, nombreTostadaFragment);
            fragmentTransaction.commit();
        }
    };

}
