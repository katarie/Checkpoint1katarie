package com.example.katarie.checkpoint1katarie;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nom = (TextView) findViewById(R.id.nom);
        final TextView prenom = (TextView) findViewById(R.id.prenon);
        final TextView ecole = (TextView) findViewById(R.id.ecole);
        final TextView langage = (TextView) findViewById(R.id.langage);
        final Button button = (Button) findViewById(R.id.evoyer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomstring = nom.getText().toString();
                String prenomstring = prenom.getText().toString();
                String ecolestring = ecole.getText().toString();
                String langagestring = langage.getText().toString();

                if (nom.getText().toString().isEmpty()
                        || prenom.getText().toString().isEmpty()|| ecole.getText().toString().isEmpty() || langage.getText().toString().isEmpty()){
                    Context context = getApplicationContext();
                    CharSequence text = "Remplissez Nom, Prénom, Ecole et Langage !";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }else{
                    Intent intent = new Intent(MainActivity.this,
                            StudentActivity.class);
                    intent.putExtra("Nom",  nomstring);
                    intent.putExtra("Prénom", prenomstring);
                    intent.putExtra("Ecole", ecolestring);
                    intent.putExtra("Langage", langagestring);
                    MainActivity.this.startActivity(intent);


                }

            }
        });


    }
}
