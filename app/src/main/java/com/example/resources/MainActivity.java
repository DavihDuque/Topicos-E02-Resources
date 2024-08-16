package com.example.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class MainActivity extends AppCompatActivity {

    private String strAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pegando a String do ID
        strAlert = getString(R.string.str_alert);

        Button btnSurprise = findViewById(R.id.btn_surprise);
        btnSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, strAlert, Toast.LENGTH_LONG);
                toast.setGravity(CENTER, 0, 0);
                toast.show();
            }
        });
    }
}