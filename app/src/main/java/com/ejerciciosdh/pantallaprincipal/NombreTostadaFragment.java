package com.ejerciciosdh.pantallaprincipal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ejerciciosdh.pantallaprincipalactivity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NombreTostadaFragment extends Fragment {
    private EditText txtNombre;
    private Button btnEnviar;

    public NombreTostadaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_nombre_tostada2, container, false);
        txtNombre = view.findViewById(R.id.txtNombre);
        btnEnviar = view.findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(listenerBtnEnviar);

        return view;
    }

    View.OnClickListener listenerBtnEnviar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "El mensaje es: " + txtNombre.getText().toString(), Toast.LENGTH_LONG).show();
        }
    };

}
