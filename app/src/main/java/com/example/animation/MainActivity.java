package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isView1Visible = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void animate(View view) {
        if (isView1Visible){
            ImageView pugalo = findViewById(R.id.imageView1);
            pugalo.animate().scaleX(0).scaleY(0).rotation(pugalo.getRotation()+1800).alpha(0).setDuration(3000);
            ImageView witch = findViewById(R.id.imageView2);
            witch.animate().scaleX(1).scaleY(1).rotation(witch.getRotation()+1800).alpha(1).setDuration(3000);
            isView1Visible = false;
        } else {
            ImageView pugalo = findViewById(R.id.imageView1);
            pugalo.animate().scaleX(1).scaleY(1).rotation(pugalo.getRotation()+1800).alpha(1).setDuration(3000);
            ImageView witch = findViewById(R.id.imageView2);
            witch.animate().scaleX(0).scaleY(0).rotation(witch.getRotation()+1800).alpha(0).setDuration(3000);
            isView1Visible = true;
        }




    }
}
