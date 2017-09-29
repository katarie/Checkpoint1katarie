package com.example.katarie.checkpoint1katarie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Intent intent = getIntent();
        String nomstring = intent.getStringExtra("Nom");
        String prenomstring = intent.getStringExtra("Prénom");
        String ecolestring = intent.getStringExtra("Ecole");
        String langagestring = intent.getStringExtra("Langage");

        TextView textViewnom = (TextView) findViewById(R.id.description_nom);
        textViewnom.setText(nomstring);

        TextView textViewprenom = (TextView) findViewById(R.id.description_prenom);
        textViewprenom.setText(prenomstring);

        TextView textViewecole = (TextView) findViewById(R.id.description_ecole);
        textViewecole.setText(ecolestring);

        TextView textViewlangage = (TextView) findViewById(R.id.description_langage);
        textViewlangage.setText(langagestring);


    }
}
