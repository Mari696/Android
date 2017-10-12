package com.example.d2a.resepm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ramen_btn = (ImageView)findViewById(R.id.imageView);
        ImageView onigiri_btn = (ImageView)findViewById(R.id.imageView2);
        ImageView sushi_btn = (ImageView)findViewById(R.id.imageView3);

        ramen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cheese.class);
                startActivity(intent);
            }
        });

        onigiri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Croq.class);
                startActivity(intent);
            }
        });

        sushi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Coffee.class);
                startActivity(intent);
            }
        });

    }
}




