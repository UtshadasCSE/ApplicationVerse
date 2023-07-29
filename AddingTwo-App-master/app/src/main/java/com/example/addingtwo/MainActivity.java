package com.example.addingtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        answer=findViewById(R.id.ans);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sn=num1.getText().toString();
                String snn=num2.getText().toString();

                int in=Integer.parseInt(sn);
                int inn=Integer.parseInt(snn);
                int sum = in +in;
                Toast.makeText(MainActivity.this, "Your answer is "+sum, Toast.LENGTH_SHORT).show();
            }
        });
    }
}