package com.example.numad21fa_zhixuancao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = findViewById(R.id.aboutTextView);
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Zhixuan, Email:cao.z@neu.edu",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.clickButton:
                openActivity();
                break;
        }
        switch (view.getId()) {
            case R.id.floatButton:
                openLinkActivity();
                break;
        }
        switch (view.getId()) {
            case R.id.locationButton:
                openLocationActivity();
                break;
        }
    }
    public void openActivity(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openLinkActivity(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openLocationActivity(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}