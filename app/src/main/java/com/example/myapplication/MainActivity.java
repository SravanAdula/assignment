package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapter.CustomAdapter;
import com.example.myapplication.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<User> user;

    public ArrayList<User> generateUser()
    {
        user=new ArrayList<>();
        user.add(new User("SPECIAL 26", "Hindi language heist film", "6.5/10", R.drawable.special));
        user.add(new User("ene", "Best comedy Telugu film", "8/10", R.drawable.ENE));
        user.add(new User("khaidi", "Suspense film", "8.5/10", R.drawable.Khaidi));
        user.add(new User("hit", "Thriller", "7/10", R.drawable.Hit));
        user.add(new User("pc", "Family Entertainment", "9/10", R.drawable.PC));

        return user;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        user=generateUser();
        CustomAdapter adapter=new CustomAdapter(user);
        listView.setAdapter(adapter);


    }
}