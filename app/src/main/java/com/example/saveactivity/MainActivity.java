package com.example.saveactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView message;
    Button btn;

    private int m_lession = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.message);
        btn = findViewById(R.id.button);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m_lession++;
                btn.setBackgroundColor(Color.GREEN);
                setMessage();
            }
        });

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null)
        {
            m_lession = savedInstanceState.getInt("baihoc");
            int c = savedInstanceState.getInt("color");
            btn.setBackgroundColor(c);
            setMessage();
        }


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        ColorDrawable color =(ColorDrawable) btn.getBackground();
        int mamau = color.getColor();

        outState.putInt("baihoc", m_lession);
        outState.putInt("color", mamau);


    }

    private void setMessage()
    {
        message.setText("Bai hoc so:" + m_lession);
    }
}