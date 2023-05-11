package com.example.oel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize the UI elements
        Button example1Button = findViewById(R.id.example1_button);
        Button example2Button = findViewById(R.id.example2_button);
        Button example3Button = findViewById(R.id.example3_button);
        Button example4Button = findViewById(R.id.example4_button);

        // Set click listeners for the buttons
        example1Button.setOnClickListener(v -> openExample1());

        example2Button.setOnClickListener(v -> openExample2());

        example3Button.setOnClickListener(v -> openExample3());

        example4Button.setOnClickListener(v -> openExample4());
    }

    // Open the first example activity
    private void openExample1() {
        Intent intent = new Intent(LoginActivity.this, CarpoolingActivity.class);
        startActivity(intent);
    }

    private void openExample2() {
        Intent intent = new Intent(LoginActivity.this, EarningActivity.class);
        startActivity(intent);
    }

    private void openExample3() {
        Intent intent = new Intent(LoginActivity.this, TransportationActivity.class);
        startActivity(intent);
    }
    private void openExample4() {
        Intent intent = new Intent(LoginActivity.this, CostsavingActivity.class);
        startActivity(intent);
    }
}