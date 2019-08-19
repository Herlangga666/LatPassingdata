package com.example.latpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class order extends AppCompatActivity {
String name,addres,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        TextView txtnama = (TextView)findViewById(R.id.nama_order);
        TextView txtalamat = (TextView)findViewById(R.id.alamat_order);
        TextView txtpesan = (TextView)findViewById(R.id.pesanan);
        Button btn_gagal = (Button)findViewById(R.id.btn_cancel);

        name = getIntent().getStringExtra("nama");
        addres = getIntent().getStringExtra("alamat");
        order = getIntent().getStringExtra("pesanan");

        txtnama.setText(name);
        txtalamat.setText(addres);
        txtpesan.setText(order);

        btn_gagal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(order.this,MainActivity.class));
            }
        });

    }
}
