package com.project.hotelreservation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize views
        TextView textViewSecondScreen = findViewById(R.id.textViewSecondScreen);

        // Retrieve data from Intent (if needed)
        String dataFromIntent = getIntent().getStringExtra("key");

        // Set text to the TextView
        if (dataFromIntent != null) {
            textViewSecondScreen.setText(dataFromIntent);
        } else {
            textViewSecondScreen.setText("Default Text");
        }

        // Set up any necessary listeners or additional initialization
        // ...

        // Example: Call a method to perform additional setup
        performAdditionalSetup();
    }

    private void performAdditionalSetup() {
        // Additional setup logic for the second screen
    }

    // Other methods and code for the second screen
}
