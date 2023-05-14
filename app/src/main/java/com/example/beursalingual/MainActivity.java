package com.example.beursalingual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Adapter Class declarations:
    RecyclerView recyclerView;
    Adapter adapter;

    // declaring menu buttons:
    private Button grizzlyButton;
    private Button polarButton;
    private Button pandaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adapter Class initializations:
        recyclerView = findViewById(R.id.recyclerview);

        // initializing menu buttons:
        grizzlyButton = findViewById(R.id.grizzly);
        polarButton = findViewById(R.id.polar);
        pandaButton = findViewById(R.id.panda);

        // on-click listeners for menu buttons:
        grizzlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GrizzlyPage.class));
            }
        });
        polarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PolarPage.class));
            }
        });
        pandaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PandaPage.class));
            }
        });

        Intent intent = getIntent();
        int keyNumber = intent.getIntExtra(GrizzlyPage.KEY_AS_PARAMETER, 0);

        TextView textView = findViewById(R.id.heading);
        textView.append(""+keyNumber);

    }
}
