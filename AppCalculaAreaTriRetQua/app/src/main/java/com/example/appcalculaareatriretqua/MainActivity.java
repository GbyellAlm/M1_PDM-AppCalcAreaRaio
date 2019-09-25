package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAvancou (View view) {
        try {
            RadioGroup operacaoInicial = findViewById(R.id.rgOperacaoInicial);

            if (operacaoInicial.getCheckedRadioButtonId() == R.id.rdOpQuadrado) {
                Intent intencaoAbrirTelaInformeDadosQuadrado = new Intent(this, TelaInformeDadosQuadradoActivity.class);
                startActivity(intencaoAbrirTelaInformeDadosQuadrado);
            } else if (operacaoInicial.getCheckedRadioButtonId() == R.id.rdOpRetangulo) {
                Intent intencaoAbrirTelaInformeDadosRetangulo = new Intent(this, TelaInformeDadosRetanguloActivity.class);
                startActivity(intencaoAbrirTelaInformeDadosRetangulo);
            } else if (operacaoInicial.getCheckedRadioButtonId() == R.id.rdOpTri) {
                Intent intencaoAbrirTelaInformeDadosTriangulo = new Intent(this, TelaInformeDadosTrianguloActivity.class);
                startActivity(intencaoAbrirTelaInformeDadosTriangulo);
            } else if (operacaoInicial.getCheckedRadioButtonId() == R.id.rdOpCir) {
                Intent intecaoAbrirTelaInformeDadoCirculo = new Intent(this, TelaInformeDadoCirculoActivity.class);
                startActivity(intecaoAbrirTelaInformeDadoCirculo);
            }
        }
        catch (Exception e) {
            Toast.makeText(this, "Erro ao tentar abrir a próxima tela.", Toast.LENGTH_LONG).show();
        }
    }
}
