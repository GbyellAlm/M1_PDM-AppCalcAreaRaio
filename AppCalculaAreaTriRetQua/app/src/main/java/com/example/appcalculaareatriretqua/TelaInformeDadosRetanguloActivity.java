package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaInformeDadosRetanguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informe_dados_retangulo);
    }

    public void btnCalculouRetangulo(View view) {
        EditText inpBase = findViewById(R.id.inpBaseRetangulo);
        EditText inpAltura = findViewById(R.id.inpAlturaRetangulo);

        try {
            double base = Double.parseDouble(inpBase.getText().toString());
            double altura = Double.parseDouble(inpAltura.getText().toString());

            if (base == altura) {
                AlertDialog.Builder cxaValidadora = new AlertDialog.Builder(TelaInformeDadosRetanguloActivity.this);
                cxaValidadora.setTitle("Retângulo inválido inserido:");
                cxaValidadora.setMessage("O retângulo que você inseriu possui lados (medidas) iguais. Um retângulo para ser retângulo precisa ter lados diferentes!");
                cxaValidadora.setNeutralButton("Entendi", null);
                cxaValidadora.show();
            } else {
                double operacao = base * altura;

                Intent intencaoMostrarResultadoRetangulo = new Intent(this, TelaResultadoRetActivity.class);
                intencaoMostrarResultadoRetangulo.putExtra("operacao", operacao);
                startActivity(intencaoMostrarResultadoRetangulo);
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Erro de operação! :(", Toast.LENGTH_LONG).show();
        }
    }
}
