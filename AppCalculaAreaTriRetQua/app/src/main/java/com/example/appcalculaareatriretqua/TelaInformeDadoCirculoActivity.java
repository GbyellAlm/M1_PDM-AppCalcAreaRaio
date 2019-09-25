package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaInformeDadoCirculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informe_dado_circulo);
    }

    public void btnCalculouCirculo(View view) {
        EditText inpRaio = findViewById(R.id.inpRaio);

        try {
            double raio = Double.parseDouble(inpRaio.getText().toString());

            double operacao = 3.14 * (raio * raio);

            Intent intencaoMostrarResultadoCirculo = new Intent(this, TelaResultadoCirActivity.class);
            intencaoMostrarResultadoCirculo.putExtra("operacao", operacao);
            startActivity(intencaoMostrarResultadoCirculo);

        }
        catch (Exception e) {
            Toast.makeText(this, "Erro de operação! :(", Toast.LENGTH_LONG).show();
        }
    }
}
