package com.newtechieblog.wordpress.views.multiplelanguagesupport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.buttonToast);

        btnShow.setOnClickListener(v -> Toast.makeText(getApplicationContext(), R.string.toast, Toast.LENGTH_LONG).show());

    }
}