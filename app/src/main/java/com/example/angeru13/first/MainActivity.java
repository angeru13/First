package com.example.angeru13.first;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View v){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Integer.parseInt(snum1) + Integer.parseInt(snum2)));
    }

    public void minus(View v){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Integer.parseInt(snum1) - Integer.parseInt(snum2)));
    }

    public void multiples(View v){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Integer.parseInt(snum1) * Integer.parseInt(snum2)));
    }

    public void division(View v){
        EditText num1 = (EditText)findViewById(R.id.first_number);
        EditText num2 = (EditText)findViewById(R.id.second_number);
        TextView res = (TextView)findViewById(R.id.result);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        res.setText("" + (Integer.parseInt(snum1) / Integer.parseInt(snum2)));
    }

    public void next(View view) {
       // Intent intent = new Intent(this, Main6Activity.class);
       // String text = ((Button)view).getText().toString();
       // intent.putExtra("num", Integer.parseInt(text));
       // startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://myitschool.ru"));
        startActivity(intent);

    }
}
