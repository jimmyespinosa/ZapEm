package com.example.jimmyespinosa.zapem.ui.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jimmyespinosa.zapem.R;

public class MainActivity extends AppCompatActivity {

    private Button startStory;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storyStart();
        storyDestroy();

    }

    public void storyStart(){
        startStory = (Button) findViewById(R.id.startStory);

        startStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
            }
        });

    }

    public void storyDestroy(){
        exit = (Button) findViewById(R.id.exitBtn);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });

    }


    public void onDestroy(){
        super.onDestroy();
    }

}
