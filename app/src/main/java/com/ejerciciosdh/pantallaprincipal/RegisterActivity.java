package com.ejerciciosdh.pantallaprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText txtUsername;
    private EditText txtPassword;
    private EditText txtConfirmPassword;
    private Button btnRegistrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        txtConfirmPassword = findViewById(R.id.txtConfirmPassword);
        btnRegistrer = findViewById(R.id.btnRegistrer);

        btnRegistrer.setOnClickListener(registrerListener);
    }

    View.OnClickListener registrerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (!validarPassword()) {
                Toast.makeText(getApplicationContext(), "Las constraseñas son distintas", Toast.LENGTH_LONG).show();
            } else {
                finish();
            }
        }
    };

    private Boolean validarPassword() {
        return !txtPassword.getText().toString().isEmpty() && txtPassword.getText().toString().equals(txtConfirmPassword.getText().toString());
    }
}
