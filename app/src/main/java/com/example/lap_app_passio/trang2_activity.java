package com.example.lap_app_passio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class trang2_activity extends AppCompatActivity {
    ImageView img_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang2);

        img_back_home= (ImageView)findViewById(R.id.back_home);
        img_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(trang2_activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
