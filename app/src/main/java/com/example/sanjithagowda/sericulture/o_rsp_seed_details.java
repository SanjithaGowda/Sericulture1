package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class o_rsp_seed_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_rsp_seed_details);
    }

    public void rsp(View view) {
        Intent intent = new Intent(this, o_rsp_details.class);
        startActivity(intent);
    }
    public void submit1(View view)
    {
        Intent intent = new Intent(this, O_form_activity.class);
        startActivity(intent);
    }
}
