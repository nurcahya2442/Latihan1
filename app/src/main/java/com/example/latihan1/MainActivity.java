package com.example.latihan1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button nur;
    Button dea;
    Button regita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dea = (Button) findViewById(R.id.dea);
        dea.setOnClickListener(this);

        nur = (Button) findViewById(R.id.nur);
        nur.setOnClickListener(this);

        regita = (Button) findViewById(R.id.regita);
        regita.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dea:
                Intent idea = new Intent(MainActivity.this, BiodataDea.class);
                startActivity(idea);
                break;
            case R.id.nur:
                Intent inur = new Intent(MainActivity.this, BiodataNur.class);
                startActivity(inur);
                break;
            case R.id.regita:
                Intent iregita = new Intent(MainActivity.this, BiodataRegita.class);
                startActivity(iregita);
                break;
            default:
                break;
        }
    }
}