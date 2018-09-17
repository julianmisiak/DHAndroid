package com.ejerciciosdh.pantallaprincipal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class Ejercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio1_activity);

        Button button = findViewById(R.id.button);
        Button btnCambiarColorTexto = findViewById(R.id.btnCambiarColorTexto);
        Button btnCambiarContenidoTexto = findViewById(R.id.btnCambiarContenidoTexto);
        button.setOnClickListener(listener);
        btnCambiarColorTexto.setOnClickListener(btnCambiarColorListener);
        btnCambiarContenidoTexto.setOnClickListener(btnCambiarContenidoListener);
        Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show();
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.editText);
            String texto = editText.getText().toString();
            View layout = findViewById(R.id.layout);
            layout.setBackgroundColor(Color.BLUE);


        }
    };

    View.OnClickListener btnCambiarColorListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.editText);
            editText.setTextColor(Color.YELLOW);

        }
    };

    View.OnClickListener btnCambiarContenidoListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.editText);
            editText.setText("Dale Boca");
        }
    };

}
