package com.example.accessingnumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NumActivity extends AppCompatActivity {
    Button BTN;
    EditText EditId;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_activity);

        BTN = findViewById(R.id.send);
        EditId = findViewById(R.id.gettext);
        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NumActivity.this,MainActivity.class);
                int Num = Integer.parseInt(EditId.getText().toString());
//                String value = EditId.getText().toString();
                Bundle b = new Bundle();

                b.putInt("ID",Num);
//                b.putString("id",value);
                i.putExtras(b);
                startActivity(i);

            }
        });

    }
}


