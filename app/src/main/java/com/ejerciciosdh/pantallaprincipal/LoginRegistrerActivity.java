package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class LoginRegistrerActivity extends AppCompatActivity {
    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnLogin;
    private Button btnRegistrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_registrer_activity);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistrer = findViewById(R.id.btnRegistrer);

        btnLogin.setOnClickListener(btnLoginListener);
        btnRegistrer.setOnClickListener(btnRegistrerListener);
    }

    View.OnClickListener btnLoginListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginRegistrerActivity.this, LoginActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(LoginActivity.KEY_USERNAME, txtUsername.getText().toString());
            intent.putExtras(bundle);

            startActivity(intent);

        }
    };

    View.OnClickListener btnRegistrerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginRegistrerActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    };
}
