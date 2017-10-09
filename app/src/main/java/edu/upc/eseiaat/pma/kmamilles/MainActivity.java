package edu.upc.eseiaat.pma.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_amiles = (Button) findViewById(R.id.button_a_miles);
        Button button_akm = (Button) findViewById(R.id.button_a_kilometres);

        final EditText edit_km = (EditText)  findViewById(R.id.edit_kilometres);
        final EditText edit_miles = (EditText)  findViewById(R.id.edit_miles);

        button_amiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skm = edit_km.getText().toString();
                if (skm == null || skm.equals("")) return;
                float km = Float.parseFloat(skm);
                float miles = km / 1.609f;
                String smiles = String.format("%f", miles);
                edit_miles.setText(smiles);

            }
        });

        button_akm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smiles = edit_miles.getText().toString();
                if (smiles == null || smiles.equals("")) return;
                float miles = Float.parseFloat(smiles);
                float km = miles * 1.609f;
                String skm = String.format("%f", km);
                edit_miles.setText(skm);

            }
        });
    }
}
