package com.example.angeru13.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent =  this.getIntent();
        int num = intent.getIntExtra("num", 0);
        TextView TV = (TextView)findViewById(R.id.text);
        TV.setText(num + "");
    }


}
