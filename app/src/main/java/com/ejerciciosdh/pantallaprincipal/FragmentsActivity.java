package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class FragmentsActivity extends AppCompatActivity {
    private Button btnEjerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        btnEjerFragment = findViewById(R.id.btnFragmentsEjer);
        btnEjerFragment.setOnClickListener(listenerEjerFragment);
    }


    View.OnClickListener listenerEjerFragment = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), FragmentsEjerActivity.class);
            startActivity(intent);
        }
    };
}
