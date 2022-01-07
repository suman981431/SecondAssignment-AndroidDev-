package com.example.accessingnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ClickBtn;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClickBtn = findViewById(R.id.Click);
        t1 = findViewById(R.id.getNum);

        ClickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NumActivity.class);
                startActivity(i);
            }
        });
        int FinalNumber = getIntent().getExtras().getInt("ID");

//        String value = getIntent().getExtras().getString("id");
        t1.setText(String.valueOf(FinalNumber));
        t1.setText(FinalNumber);

//        Bundle bundle = getIntent().getExtras();
//        String value = bundle.getString("id");
//        t1.setText(value);
    }
}