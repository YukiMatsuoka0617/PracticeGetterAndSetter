package com.example.practicegetterandsetter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv0,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewId();

        Human human = new Human();

        tv0.setText(human.getName());

        human.setName("Yuki");

        tv1.setText(human.name);

    }
    void findViewId(){
        tv0 = findViewById(R.id.textView0);
        tv1 = findViewById(R.id.textView1);
    }
}