package com.miguelcatalan.materialsearchview.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button defaultButton;
    private Button themedButton;
    private Button voiceButton;
    private Button stickyButton;
    private Button tabButton;
    private Button inputTypeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultButton = findViewById(R.id.button_default);
        defaultButton.setOnClickListener(this);
        themedButton = findViewById(R.id.button_themed);
        themedButton.setOnClickListener(this);
        voiceButton = findViewById(R.id.button_voice);
        voiceButton.setOnClickListener(this);
        stickyButton = findViewById(R.id.button_sticky);
        stickyButton.setOnClickListener(this);
        tabButton = findViewById(R.id.button_tab);
        tabButton.setOnClickListener(this);
        inputTypeButton = findViewById(R.id.button_input_type);
        inputTypeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        int id = view.getId();
        if (id == R.id.button_default) {
            intent = new Intent(this, DefaultActivity.class);
        } else if (id == R.id.button_themed) {
            intent = new Intent(this, ColoredActivity.class);
        } else if (id == R.id.button_voice) {
            intent = new Intent(this, VoiceActivity.class);
        } else if (id == R.id.button_sticky) {
            intent = new Intent(this, StickyActivity.class);
        } else if (id == R.id.button_tab) {
            intent = new Intent(this, TabActivity.class);
        } else if (id == R.id.button_input_type) {
            intent = new Intent(this, InputTypeActivity.class);
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
