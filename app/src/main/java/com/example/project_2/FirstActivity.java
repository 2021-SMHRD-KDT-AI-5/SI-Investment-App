package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button btn_rian, btn_apeech, btn_con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn_apeech = findViewById(R.id.btn_apeech);
        btn_rian = findViewById(R.id.btn_rian);
        btn_con = findViewById(R.id.btn_con);

        btn_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                it.putExtra("image","con");
                startActivity(it);
            }
        });
        btn_rian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                it.putExtra("image","rian");
                startActivity(it);
            }
        });
        btn_apeech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                it.putExtra("image","apeech");
                startActivity(it);
            }
        });
    }
}