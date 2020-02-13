package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnapagar;
    Button btnvezes;
    Button btnmenos;
    Button btndivisao;
    Button btnmais;
    Button btnigual;
    Button btnvir;
    TextView resultado;

    String concatenacao = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnapagar = findViewById(R.id.btnapagar);
        btnvezes = findViewById(R.id.btnvezes);
        btnmenos = findViewById(R.id.btnmenos);
        btndivisao = findViewById(R.id.btndivisao);
        btnmais = findViewById(R.id.btnmais);
        btnigual = findViewById(R.id.btnigual);
        btnvir = findViewById(R.id.btnvir);
        resultado = findViewById(R.id.resultado);


        btnapagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetar();
            }
        });
        btnvezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence vezes = btnvezes.getText();
                preencheCalculadora(vezes);
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence equacao   = btnigual.getText();
//              String[] separacao = String.valueOf(equacao).split("\\+",2);
//                soma(separacao[0],separacao[1]);
            }
        });
        btnmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence mais = btnmais.getText();
                preencheCalculadora(mais);
            }
        });
        btndivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence divisao = btndivisao.getText();
                preencheCalculadora(divisao);
            }
        });
        btnvir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence virgula = btnvir.getText();
                preencheCalculadora(virgula);
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence menos = btnmenos.getText();
                preencheCalculadora(menos);
            }
        });

    }
    private void preencheCalculadora ( CharSequence texto){
        concatenacao = concatenacao + texto;
        resultado.setText(concatenacao);
    }

    private void resetar (){
        concatenacao =  "";
        resultado.setText(concatenacao);
    }
    private void soma (String numeroA, String numeroB){
        Integer somatoria = Integer.valueOf(numeroA)+Integer.valueOf(numeroB);
        resultado.setText(String.valueOf(somatoria));

    }
}

