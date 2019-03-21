package com.example.primeiraaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void atualizarTexto(View view){
        Random random = new Random ();
        TextView text = findViewById(R.id.meuTexto);
        ArrayList<String> frase = new ArrayList<>(5);

        frase.add("Você não é flor, mas adoraria acordar com seu cheiro.");
        frase.add("Eu não sou táxi, mas pode me pegar.");
        frase.add("Gata, você não é escola de samba, mas para você daria 10.");
        frase.add("Você não é rio, mas adoraria mergulhar em você.");
        frase.add("Gata, você não é Trio Elétrico, mas queria ir atrás de você.");

        String fraseAleatoria = frase.get(random.nextInt(frase.size()));
        text.setText(fraseAleatoria);


    }
}
