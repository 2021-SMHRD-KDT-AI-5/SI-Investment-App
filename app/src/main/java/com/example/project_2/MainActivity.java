package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    int[] imageIdList = new int[3];
    Button btn_pre, btn_next;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = findViewById(R.id.imageview);
        btn_pre = findViewById(R.id.btn_pre);
        btn_next = findViewById(R.id.btn_next);

        Intent it = getIntent();
        String image = it.getStringExtra("image");
        if(image.equals("apeech")){
            imageIdList[0] = R.drawable.apeech1;
            imageIdList[1] = R.drawable.apeech2;
            imageIdList[2] = R.drawable.apeech3;
            imageview.setImageResource(R.drawable.apeech1);
        }else if(image.equals("rian")){
            imageIdList[0] = R.drawable.rian1;
            imageIdList[1] = R.drawable.rian2;
            imageIdList[2] = R.drawable.rian3;
            imageview.setImageResource(R.drawable.rian1);
        }else if(image.equals("con")){
            imageIdList[0] = R.drawable.con1;
            imageIdList[1] = R.drawable.con2;
            imageIdList[2] = R.drawable.con3;
            imageview.setImageResource(R.drawable.con1);
        }

        btn_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == 0){
                    index = imageIdList.length-1;
                }else{
                    index--;
                }
                imageview.setImageResource(imageIdList[index]);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == imageIdList.length-1){
                    index = 0;
                }else{
                    index++;
                }
                imageview.setImageResource(imageIdList[index]);
            }
        });
    }
}