package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class LoginActivity extends AppCompatActivity {
    public static final String KEY_USERNAME = "username";
    private TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        txtUsername = findViewById(R.id.txtUsername);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String username = bundle.getString(KEY_USERNAME);
        txtUsername.setText(username);

    }
}
