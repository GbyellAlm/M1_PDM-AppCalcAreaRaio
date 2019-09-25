package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaInformeDadosTrianguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informe_dados_triangulo);
    }

    public void btnCalculouTriangulo(View view) {
        EditText inpBase = findViewById(R.id.inpBaseTriangulo);
        EditText inpAltura = findViewById(R.id.inpAlturaTriangulo);

        try {
            double base = Double.parseDouble(inpBase.getText().toString());
            double altura = Double.parseDouble(inpAltura.getText().toString());

            double operacao = (base * altura) / 2;

            Intent intencaoMostrarResultadoTriangulo = new Intent(this, TelaResultadoTriActivity.class);
            intencaoMostrarResultadoTriangulo.putExtra("operacao", operacao);
            startActivity(intencaoMostrarResultadoTriangulo);

        }
        catch (Exception e) {
            Toast.makeText(this, "Erro de operação! :(", Toast.LENGTH_LONG).show();
        }
    }
}
