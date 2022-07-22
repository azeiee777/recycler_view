package com.aziztraders.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    String[] data = {"C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.recyclerView);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new RecyclerViewAdapter(data));
    }
}