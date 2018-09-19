package com.ejerciciosdh.pantallaprincipal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ejerciciosdh.pantallaprincipalactivity.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class SenderActivity extends AppCompatActivity {
    @BindView(R.id.txtNombre)
    EditText txtNombre;
    @BindView(R.id.txtApellido)
    EditText txtApellido;
    @BindView(R.id.txtEdad)
    EditText txtEdad;
    @BindView(R.id.btnMandar)
    Button btnMandar;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sender_activity);
        unbinder = ButterKnife.bind(this);

        btnMandar.setOnClickListener(intentListener);


    }

    View.OnClickListener intentListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), ReceptorActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(ReceptorActivity.KEY_NOMBRE, txtNombre.getText().toString());
            bundle.putString(ReceptorActivity.KEY_APELLIDO, txtApellido.getText().toString());
            bundle.putString(ReceptorActivity.KEY_EDAD, txtEdad.getText().toString());

            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
