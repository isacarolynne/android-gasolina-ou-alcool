package com.example.gasolinaalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GasolinaOuAlcool extends AppCompatActivity {

    private EditText alcool;
    private EditText gasolina;
    private Button botao;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina_ou_alcool);

        alcool = findViewById(R.id.alcoolId);
        gasolina = findViewById(R.id.gasolinaId);
        botao = findViewById(R.id.botaoId);
        textoResultado = findViewById(R.id.resultadoId);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar os valores digitados
                String precoAcool = alcool.getText().toString();
                String precoGasolina = gasolina.getText().toString();

                if(precoAcool.isEmpty() || precoGasolina.isEmpty()){

                    textoResultado.setText("Digite um valor");

                }else{

                //converte string para numeros
                Double valorAlcool = Double.parseDouble(precoAcool);
                Double valorGasolina = Double.parseDouble(precoGasolina);

                //conta alcool/gasolina
                double resultado = valorAlcool/valorGasolina;


                if(resultado>=0.7){
                    textoResultado.setText("É melhor utilizar Gasolina");
                }else{
                    textoResultado.setText("É melhor utilizar Álcool");
                }

            }}
        });


    }
}
