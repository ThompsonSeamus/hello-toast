package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Counter counter;
    private TextView countTv;
    private Button toastButton;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();
        countTv = findViewById(R.id.showCount);
        toastButton = findViewById(R.id.toastButton);
        countButton = findViewById(R.id.countButton);
    }

    public void toastMessage(View view){
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    public void more(View view){
        counter.add();
        countTv.setText(counter.getValue().toString());
    }

    public void less(View view){
        counter.less();
        countTv.setText(counter.getValue().toString());
    }

    public void reset(View view){
        counter.reset();
        countTv.setText(counter.getValue().toString());
    }
}