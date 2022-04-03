package com.example.learnacitivyti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.layout_activity1);

        textView = findViewById(R.id.textview1);
//        String s = textView.getText().toString();
        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView.getText().toString();


              startActivityForResult(new Intent().setClass(Activity1.this, Activity2.class).putExtra("dulieu", s), Activity2.TRAVETU_ACTIVITY2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Activity2.TRAVETU_ACTIVITY2)
        {
            String s = data.getStringExtra("dulieu");

            textView.setText(s);
        }
    }
}
