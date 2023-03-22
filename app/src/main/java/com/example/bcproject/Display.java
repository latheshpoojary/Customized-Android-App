package com.example.bcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    TextView kg1,amt1,kg2,amt2,kg3,amt3,kg4,amt4,kg5,amt5,kg6,amt6,totalkg,totalamt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        kg1=(TextView)findViewById(R.id.kg1);
        amt1=(TextView)findViewById(R.id.amt1);
        kg2=(TextView)findViewById(R.id.kg2);
        amt2=(TextView)findViewById(R.id.amt2);
        kg3=(TextView)findViewById(R.id.kg3);
        amt3=(TextView)findViewById(R.id.amt3);
        kg4=(TextView)findViewById(R.id.kg4);
        amt4=(TextView)findViewById(R.id.amt4);
        kg5=(TextView)findViewById(R.id.kg5);
        amt5=(TextView)findViewById(R.id.amt5);
        kg6=(TextView)findViewById(R.id.kg6);
        amt6=(TextView)findViewById(R.id.amt6);
        totalamt=(TextView) findViewById(R.id.totalamt);
        totalkg=(TextView) findViewById(R.id.totalkg);
        Intent i=getIntent();

        kg1.setText(i.getStringExtra("kg1"));
        kg2.setText(i.getStringExtra("kg2"));
        kg3.setText(i.getStringExtra("kg3"));
        kg4.setText(i.getStringExtra("kg4"));
        kg5.setText(i.getStringExtra("kg5"));
        kg6.setText(i.getStringExtra("kg6"));
        amt1.setText(i.getStringExtra("amt1"));
        amt2.setText(i.getStringExtra("amt2"));
        amt3.setText(i.getStringExtra("amt3"));
        amt4.setText(i.getStringExtra("amt4"));
        amt5.setText(i.getStringExtra("amt5"));
        amt6.setText(i.getStringExtra("amt6"));
        totalkg.setText(i.getStringExtra("totalkg"));
        totalamt.setText(i.getStringExtra("totalamt"));


    }
}