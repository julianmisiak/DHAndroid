package com.ejerciciosdh.pantallaprincipal;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ejerciciosdh.pantallaprincipalactivity.R;

public class CalculadoraActivity extends AppCompatActivity {
    private EditText txtPantalla;
    private EditText etPantallaSubtotal;
    private Button btnC;
    private Button btnSumRes;
    private Button btnPorciento;
    private Button btnDividir;
    private Button btnMultiplicacion;
    private Button btnResta;
    private Button btnSuma;
    private Button btnIgual;
    private Button btnCero;
    private Button btnUno;
    private Button btnDos;
    private Button btnTres;
    private Button btnCuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSiete;
    private Button btnOcho;
    private Button btnNueve;
    private Button btnPunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_activity);
        txtPantalla = findViewById(R.id.etPantalla);
        etPantallaSubtotal = findViewById(R.id.etPantallaSubtotal);
        btnC = findViewById(R.id.btnC);
        btnSumRes = findViewById(R.id.btnSumRes);
        btnPorciento = findViewById(R.id.btnPorciento);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnResta = findViewById(R.id.btnResta);
        btnSuma = findViewById(R.id.btnSuma);
        btnIgual = findViewById(R.id.btnIgual);
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnPunto = findViewById(R.id.btnPunto);

        btnC.setOnClickListener(borradolistener);
        btnSumRes.setOnClickListener(operecioneslistener);
        btnDividir.setOnClickListener(operecioneslistener);
        btnMultiplicacion.setOnClickListener(operecioneslistener);
        btnResta.setOnClickListener(operecioneslistener);
        btnSuma.setOnClickListener(operecioneslistener);

        btnSumRes.setOnClickListener(cambioSignolistener);

        btnCero.setOnClickListener(numeroslistener);
        btnUno.setOnClickListener(numeroslistener);
        btnDos.setOnClickListener(numeroslistener);
        btnTres.setOnClickListener(numeroslistener);
        btnCuatro.setOnClickListener(numeroslistener);
        btnCinco.setOnClickListener(numeroslistener);
        btnSeis.setOnClickListener(numeroslistener);
        btnSiete.setOnClickListener(numeroslistener);
        btnOcho.setOnClickListener(numeroslistener);
        btnNueve.setOnClickListener(numeroslistener);
        btnPunto.setOnClickListener(numeroslistener);
        btnIgual.setOnClickListener(igualListener);

        btnPorciento.setOnClickListener(porcientoListener);
    }

    View.OnClickListener porcientoListener = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {
            Double valorOperacion = Double.parseDouble(txtPantalla.getText().toString());
            String resultado = Double.toString(valorOperacion / 100.0);
            txtPantalla.setText(resultado);

        }
    };


    View.OnClickListener numeroslistener = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void onClick(View v) {
            Button b = (Button) v;
            String botonTxt = b.getText().toString();
            if (txtPantalla.getText().toString().equals("0") && !botonTxt.equals(".")) {
                txtPantalla.setText("");
            }

            if (!botonTxt.toString().equals(".") || !contientePunto()) {
                if (botonTxt.toString().equals(".")) {
                }
                txtPantalla.setText(txtPantalla.getText().toString().concat(botonTxt));

            }


        }
    };

    View.OnClickListener operecioneslistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            char ultimo = 0;
            Button b = (Button) v;
            String botonTxt = b.getText().toString();
            String valorPantalla = txtPantalla.getText().toString();
            String valorPantallaSubtotal = etPantallaSubtotal.getText().toString();
            Integer tamValorPantallaSubtotal = valorPantallaSubtotal.length();

            if (!valorPantalla.isEmpty()) {
                ultimo = valorPantalla.charAt(valorPantalla.length() - 1);
                if (ultimo == '.') {
                    valorPantalla = valorPantalla.substring(0, valorPantalla.length() - 1);
                }
            }

            if (!valorPantallaSubtotal.isEmpty()) {
                ultimo = valorPantallaSubtotal.charAt(tamValorPantallaSubtotal - 1);
            }

            if (tamValorPantallaSubtotal > 0 && (ultimo == '+' || ultimo == '-' || ultimo == '/' || ultimo == 'x')) {
                valorPantallaSubtotal = valorPantallaSubtotal.substring(0, tamValorPantallaSubtotal - 1);

                if (!valorPantalla.isEmpty()) {
                    Double valorOperacion1 = Double.parseDouble(valorPantalla.toString());
                    Double valorOperacion2 = Double.parseDouble(valorPantallaSubtotal.toString());
                    switch (botonTxt) {
                        case "+":
                            valorOperacion2 += valorOperacion1;
                            break;
                        case "-":
                            valorOperacion2 -= valorOperacion1;
                            break;
                        case "/":
                            if (valorOperacion1.equals(new Double(0))) {
                                valorOperacion2 = 0.0;
                            } else {
                                valorOperacion2 /= valorOperacion1;
                            }
                            break;
                        case "x":
                            valorOperacion2 *= valorOperacion1;
                    }

                    txtPantalla.setText(valorOperacion2.toString());
                    etPantallaSubtotal.setText("");
                } else {
                    valorPantallaSubtotal += botonTxt;
                    txtPantalla.setText("");
                    etPantallaSubtotal.setText(valorPantallaSubtotal);
                }

            } else {
                valorPantallaSubtotal = valorPantalla;
                valorPantallaSubtotal += botonTxt;
                txtPantalla.setText("");
                etPantallaSubtotal.setText(valorPantallaSubtotal);
            }


        }
    };

    View.OnClickListener borradolistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            txtPantalla.setText("0");
            etPantallaSubtotal.setText("");
        }
    };

    View.OnClickListener cambioSignolistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Double valorOperacion = Double.parseDouble(txtPantalla.getText().toString());
            if (valorOperacion != 0) {
                valorOperacion *= -1;
                txtPantalla.setText(valorOperacion.toString());
            }

            Toast.makeText(getApplicationContext(), "cambioSignolistener", Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener igualListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            char ultimo = 0;
            String valorPantalla = txtPantalla.getText().toString();
            String valorPantallaSubtotal = etPantallaSubtotal.getText().toString();
            Integer tamValorPantallaSubtotal = valorPantallaSubtotal.length();

            if (!valorPantalla.isEmpty()) {
                ultimo = valorPantalla.charAt(valorPantalla.length() - 1);
                if (ultimo == '.') {
                    valorPantalla = valorPantalla.substring(0, valorPantalla.length() - 1);
                }
            }
            if (!valorPantallaSubtotal.isEmpty()) {
                ultimo = valorPantallaSubtotal.charAt(tamValorPantallaSubtotal - 1);
            } else {
                return;
            }

            valorPantallaSubtotal = valorPantallaSubtotal.substring(0, tamValorPantallaSubtotal - 1);

            if (!valorPantalla.isEmpty()) {
                Double valorOperacion1 = Double.parseDouble(valorPantalla.toString());
                Double valorOperacion2 = Double.parseDouble(valorPantallaSubtotal.toString());
                switch (ultimo) {
                    case '+':
                        valorOperacion2 += valorOperacion1;
                        break;
                    case '-':
                        valorOperacion2 -= valorOperacion1;
                        break;
                    case '/':
                        if (valorOperacion1.equals(new Double(0))) {
                            valorOperacion2 = 0.0;
                        } else {
                            valorOperacion2 /= valorOperacion1;
                        }
                        break;
                    case 'x':
                        valorOperacion2 *= valorOperacion1;
                }

                txtPantalla.setText(valorOperacion2.toString());
                etPantallaSubtotal.setText("");

            }

        }


    };

    private Boolean contientePunto() {
        if (txtPantalla.getText().toString().contains(".")) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
