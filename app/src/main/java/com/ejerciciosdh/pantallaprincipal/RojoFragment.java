package com.ejerciciosdh.pantallaprincipal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejerciciosdh.pantallaprincipalactivity.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RojoFragment extends Fragment {


    public RojoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rojo, container, false);
    }

}
