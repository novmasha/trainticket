package com.example.trainticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText to;
    private EditText from;
    private Button button;

    private String name;
    private String addressin;
    private String addressout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        to = findViewById(R.id.to);
        from = findViewById(R.id.from);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name = nameIn.getText().toString();
            addressin = to.getText().toString();
            addressout = from.getText().toString();

            user user = new user(name, addressin, addressout);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra(user.class.getSimpleName(), user);

            startActivity(intent);
        }
    };
}