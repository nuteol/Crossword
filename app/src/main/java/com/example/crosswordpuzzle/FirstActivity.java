package com.example.crosswordpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    Button _button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        _button = (Button) findViewById(R.id.button);
        _button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //on click
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("Data","Hello World");
                startActivity(intent);
            }
        });
    }
}