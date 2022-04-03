package com.example.learnacitivyti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    public static int TRAVETU_ACTIVITY2 =1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();
        String dulieu = i.getStringExtra("dulieu");


        EditText editText = findViewById(R.id.edittext);
        editText.setText(dulieu);

        Button btn = findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(TRAVETU_ACTIVITY2, new Intent().putExtra("dulieu", editText.getText().toString()));
                finish();
            }
        });
    }
}