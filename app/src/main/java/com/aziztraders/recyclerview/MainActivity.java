package com.aziztraders.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    List<User> userData;
   /* String[] data = {"C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript",
            "C", "C++", "JAVA", "PHP", "RUBY", "C#", "Python", "JAVAScript"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userData =  initializeData();
        rcv = (RecyclerView) findViewById(R.id.recyclerView);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new RecyclerViewAdapter(userData));
    }

    private List<User> initializeData() {
        userData = new ArrayList<>();
        userData.add(new User(R.drawable.ic_launcher_foreground,"C"));
        userData.add(new User(R.drawable.ic_launcher_background,"C++"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"C#"));
        userData.add(new User(R.drawable.ic_launcher_background,"JAVA"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"Python"));
        userData.add(new User(R.drawable.ic_launcher_background,"JavaScript"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"RUBY"));
        userData.add(new User(R.drawable.ic_launcher_background,"ReactJS"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"C"));
        userData.add(new User(R.drawable.ic_launcher_background,"C++"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"C#"));
        userData.add(new User(R.drawable.ic_launcher_background,"JAVA"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"Python"));
        userData.add(new User(R.drawable.ic_launcher_background,"JavaScript"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"RUBY"));
        userData.add(new User(R.drawable.ic_launcher_background,"ReactJS"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"C"));
        userData.add(new User(R.drawable.ic_launcher_background,"C++"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"C#"));
        userData.add(new User(R.drawable.ic_launcher_background,"JAVA"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"Python"));
        userData.add(new User(R.drawable.ic_launcher_background,"JavaScript"));
        userData.add(new User(R.drawable.ic_launcher_foreground,"RUBY"));
        userData.add(new User(R.drawable.ic_launcher_background,"ReactJS"));
        return userData;
    }
}