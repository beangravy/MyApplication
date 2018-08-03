package com.example.bgarvin.myapplication.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Player> Players;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Players = new ArrayList<>();
        Players.add(new Player("Ben",1,0));
        Players.add(new Player("Rencie",2,0));



        listView =(ListView)findViewById(R.id.PlayerList);
        ArrayAdapter<String> arrayAdapter = ArrayAdapter<String>(MainActivity.this, and)

        Button AddPlayerbutton = (Button) findViewById(R.id.AddPlayerbutton);

        AddPlayerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText NewPlayereditText = (EditText) findViewById(R.id.NewPlayereditText);
                Players.add(new Player(NewPlayereditText.getText().toString(),Players.size(),0));
                NewPlayereditText.setText("");
            }

        });

    }
}