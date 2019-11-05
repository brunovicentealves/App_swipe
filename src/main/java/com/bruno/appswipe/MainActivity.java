package com.bruno.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela ;

    private TextView tvSwite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvSwite = findViewById(R.id.tvSwipe);
        tela = findViewById(R.id.tela);
        tela.setOnTouchListener(new OnSwipeTouchListener(this){

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tvSwite.setText("para baixo !");
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvSwite.setText("para cima!");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvSwite.setText("para esquerda!");
            }


            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tvSwite.setText("para direita!");
            }



        });
    }
}
