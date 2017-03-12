package com.rpl.kelompok1.gelo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StatusActivity extends AppCompatActivity implements OnClickListener{

    private Button btnPemilikJasa;
    private Button btnCustomer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        btnPemilikJasa = (Button) findViewById(R.id.btnPemilikJasa);
        btnPemilikJasa.setOnClickListener(this);
        btnCustomer = (Button) findViewById(R.id.btnCustomer);
        btnCustomer.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if (view == btnPemilikJasa) {
            startActivity(new Intent(StatusActivity.this, LoginActivity.class));

        }
        if (view == btnCustomer) {
            startActivity(new Intent(StatusActivity.this, LoginActivity.class));

        }
    }

}
