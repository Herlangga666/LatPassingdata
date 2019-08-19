package com.example.latpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton gomart;
    ImageButton gofood;
    ImageButton gosend;
    ImageButton goride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gomart = (findViewById(R.id.mart));
            gomart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent pindah = new Intent(MainActivity.this,gomart.class);
                    startActivity(pindah);
                }
            });
        gofood = (findViewById(R.id.food));
            gofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,gofood.class);
                startActivity(pindah);
            }
        });
        gosend = (findViewById(R.id.send));
        gosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,gosend.class);
                startActivity(pindah);
            }
        });

        goride = (findViewById(R.id.ride));
        goride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,goride.class);
                startActivity(pindah);
            }
        });
    }
}
