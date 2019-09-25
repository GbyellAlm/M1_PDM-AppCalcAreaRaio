package com.example.appcalculaareatriretqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaResultadoRetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado_ret);

        double operacao = getIntent().getDoubleExtra("operacao", -1);

        TextView lblResul = findViewById(R.id.lblResultOperaRetangulo);
        lblResul.setText(String.valueOf(operacao));
    }

    public void btnFazerOutraOpera2 (View view) {
        Intent vltTelaInicialMsmInstancia = new Intent(this, MainActivity.class);
        vltTelaInicialMsmInstancia.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(vltTelaInicialMsmInstancia);
    }
}
