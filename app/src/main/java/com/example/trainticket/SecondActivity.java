package com.example.trainticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView fio;
    private TextView too;
    private TextView froom;
    private Button button;

    private user user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fio = findViewById(R.id.fio);
        froom = findViewById(R.id.froom);
        too = findViewById(R.id.too);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {
            user = (user) bundleIntent.getSerializable(user.class.getSimpleName());

            fio.setText(user.getName());
            froom.setText(user.getFrom());
            too.setText(user.getTo());
        }

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}