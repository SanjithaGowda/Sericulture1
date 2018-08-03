package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SP_activity(View view) {
        Intent intent = new Intent(this, seedproducer.class);
        startActivity(intent);
    }
    public void SR_activity(View view) {
        Intent intent = new Intent(this, silkrearer.class);
        startActivity(intent);
    }
    public void A_activity(View view) {
        Intent intent = new Intent(this, analyst.class);
        startActivity(intent);
    }
    public void O_activity(View view) {
        Intent intent = new Intent(this, officer.class);
        startActivity(intent);
    }
}
