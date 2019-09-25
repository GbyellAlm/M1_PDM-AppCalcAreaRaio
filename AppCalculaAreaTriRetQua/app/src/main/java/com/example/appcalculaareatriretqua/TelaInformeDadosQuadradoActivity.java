package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaInformeDadosQuadradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informe_dados_quadrado);
    }

    public void btnCalculouQuadrado (View view) {
        EditText inpBase = findViewById(R.id.inpBaseQuadrado);
        EditText inpAltura = findViewById(R.id.inpAlturaQuadrado);

        try {
            double base = Double.parseDouble(inpBase.getText().toString());
            double altura = Double.parseDouble(inpAltura.getText().toString());

            if (base == altura) {
                double operacao = base * altura;

                Intent intencaoMostrarResultadoQuadrado = new Intent(this, TelaResultadoQuaActivity.class);
                intencaoMostrarResultadoQuadrado.putExtra("operacao", operacao);
                startActivity(intencaoMostrarResultadoQuadrado);
            } else {
                AlertDialog.Builder cxaValidadora = new AlertDialog.Builder(TelaInformeDadosQuadradoActivity.this);
                    cxaValidadora.setTitle("Quadrado inválido inserido:");
                    cxaValidadora.setMessage("O quadrado que você inseriu possui lados (medidas) diferentes. Um quadrado para ser quadrado precisa ter lados iguais!");
                    cxaValidadora.setNeutralButton("Entendi", null);
                    cxaValidadora.show();
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Erro de operação! :(", Toast.LENGTH_LONG).show();
        }
    }
}
