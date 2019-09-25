package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaResultadoTriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado_tri);

        double operacao = getIntent().getDoubleExtra("operacao", -1);

        TextView lblResul = findViewById(R.id.lblResultOperaTriangulo);
        lblResul.setText(String.valueOf(operacao));
    }

    public void btnFazerOutraOpera3 (View view) {
        Intent vltTelaInicialMsmInstancia = new Intent(this, MainActivity.class);
        vltTelaInicialMsmInstancia.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(vltTelaInicialMsmInstancia);
    }
}
