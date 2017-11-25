package com.gpetuhov.samplerxbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.gpetuhov.samplerxbinding.rxbinding.Bind;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        // This prevents button double clicks
        Bind.click(button, view -> Toast.makeText( MainActivity.this, "Click", Toast.LENGTH_LONG ).show() );
    }
}
