package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class o_choice_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_choice_activity);
    }

    public void rspform(View view) {
        Intent intent = new Intent(this, o_rsp_details.class);
        startActivity(intent);
    }
}
