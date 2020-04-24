package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectDifficulty extends AppCompatActivity {

    private Button beginner, intermediate, advanced;
    private String email;
    public static final String EXTRA_MESSAGE = "difficulty";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_difficulty);

        Intent intent = getIntent();
        email = intent.getStringExtra("email");

        beginner = findViewById(R.id.beginner);
        intermediate = findViewById(R.id.intermediate);
        advanced = findViewById(R.id.advanced);
        setTitle("Select Difficulty");

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopicsActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "easy");
                intent.putExtra("email", email);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Beginner selected", Toast.LENGTH_SHORT).show();

            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopicsActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "medium");
                intent.putExtra("email", email);
                Toast.makeText(getApplicationContext(), "Intermediate selected", Toast.LENGTH_SHORT).show();

            }
        });


        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TopicsActivity.class);
                intent.putExtra(EXTRA_MESSAGE, "hard");
                intent.putExtra("email", email);
                Toast.makeText(getApplicationContext(), "Advanced selected", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
