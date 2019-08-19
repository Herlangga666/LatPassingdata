package com.example.latpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class gofood extends AppCompatActivity {
public EditText namaa,alamatt,pesanann;
public Button btn_orderr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);
        namaa = findViewById(R.id.nama);
        alamatt = findViewById(R.id.alamat);
        pesanann = findViewById(R.id.pesanan);
        btn_orderr = findViewById(R.id.btn_order);
        btn_orderr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent extra = new Intent(gofood.this,order.class);
                extra.putExtra("nama",namaa.getText().toString());
                extra.putExtra("alamat",alamatt.getText().toString());
                extra.putExtra("pesanan",pesanann.getText().toString());
                startActivity(extra);
            }
        });

    }
}
