package com.example.bcproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText rupee,kg1,amt1,kg2,amt2,kg3,amt3,kg4,amt4,kg5,amt5,kg6,amt6;
    int tot1,tot2,tot3,tot4,tot5,tot6,totamt,totkg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rupee=(EditText)findViewById(R.id.rupee);
        kg1=(EditText)findViewById(R.id.kg1);
        amt1=(EditText)findViewById(R.id.amt1);
        kg2=(EditText)findViewById(R.id.kg2);
       amt2=(EditText)findViewById(R.id.amt2);
        kg3=(EditText)findViewById(R.id.kg3);
        amt3=(EditText)findViewById(R.id.amt3);
        kg4=(EditText)findViewById(R.id.kg4);
        amt4=(EditText)findViewById(R.id.amt4);
        kg5=(EditText)findViewById(R.id.kg5);
        amt5=(EditText)findViewById(R.id.amt5);
        kg6=(EditText)findViewById(R.id.kg6);
        amt6=(EditText)findViewById(R.id.amt6);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kgs=rupee.getText().toString();
              String user1=kg1.getText().toString();
                String user2=kg2.getText().toString();
                String user3=kg3.getText().toString();
                String user4=kg4.getText().toString();
                String user5=kg5.getText().toString();
                String user6=kg6.getText().toString();
                String receive1=amt1.getText().toString();
                String receive2=amt2.getText().toString();
                String receive3=amt3.getText().toString();
                String receive4=amt4.getText().toString();
                String receive5=amt5.getText().toString();
                String receive6=amt6.getText().toString();
                if(kgs.length()==0)
                {
                    rupee.setError("fill this field");
                    rupee.requestFocus();
                }
              else if(user1.length()==0)
              {
                  kg1.setError("Fill this field");
                  kg1.requestFocus();
              }
              else if(receive1.length()==0)
              {
                  amt1.setError("Fill this field");
                  amt1.requestFocus();
              }
              else if(user2.length()==0)
              {
                  kg2.setError("Fill this field");
                  kg2.requestFocus();
              }
              else if(receive2.length()==0)
              {
                  amt2.setError("Fill this field");
                  amt2.requestFocus();
              }
              else if(user3.length()==0)
              {
                  kg3.setError("Fill this field");
                  kg3.requestFocus();
              }
              else if(receive3.length()==0)
              {
                  amt3.setError("Fill this field");
                  amt3.requestFocus();
              }
              else if(user4.length()==0)
              {
                  kg4.setError("Fill this field");
                  kg4.requestFocus();
              }
              else if(receive4.length()==0)
              {
                  amt4.setError("Fill this field");
                  amt4.requestFocus();
              }
              else if(user5.length()==0)
              {
                  kg5.setError("Fill this field");
                  kg5.requestFocus();
              }
              else if(receive5.length()==0)
              {
                  amt5.setError("Fill this field");
                  amt5.requestFocus();
              }
              else if(user6.length()==0)
              {
                  kg6.setError("Fill this field");
                  kg6.requestFocus();
              }
              else if(receive6.length()==0)
              {
                  amt6.setError("Fill this field");
                  amt6.requestFocus();
              }



              else {


                  tot1 = (Integer.parseInt(totalAmount(kg1)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt1.getText() + "");


                  tot2 = (Integer.parseInt(totalAmount(kg2)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt2.getText() + "");

                  tot3 = (Integer.parseInt(totalAmount(kg3)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt3.getText() + "");

                  tot4 = (Integer.parseInt(totalAmount(kg4)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt4.getText() + "");

                  tot5 = (Integer.parseInt(totalAmount(kg5)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt5.getText() + "");

                  tot6 = (Integer.parseInt(totalAmount(kg6)) * Integer.parseInt(rupee.getText() + "")) - Integer.parseInt(amt6.getText() + "");

                  totkg = Integer.parseInt(totalAmount(kg1)) + Integer.parseInt(totalAmount(kg2)) + Integer.parseInt(totalAmount(kg3)) + Integer.parseInt(totalAmount(kg4)) + Integer.parseInt(totalAmount(kg5)) + Integer.parseInt(totalAmount(kg6));
                  totamt = tot1 + tot2 + tot3 + tot4 + tot5 + tot6;

                  Intent intent = new Intent(MainActivity.this, Display.class);

//

                  intent.putExtra("kg1", totalAmount(kg1));

                  intent.putExtra("kg2", totalAmount(kg2));
                  intent.putExtra("kg3", totalAmount(kg3));
                  intent.putExtra("kg4", totalAmount(kg4));
                  intent.putExtra("kg5", totalAmount(kg5));
                  intent.putExtra("kg6", totalAmount(kg6));
                  intent.putExtra("amt1", tot1 + "");
                  intent.putExtra("amt2", tot2 + "");
                  intent.putExtra("amt3", tot3 + "");
                  intent.putExtra("amt4", tot4 + "");
                  intent.putExtra("amt5", tot5 + "");
                  intent.putExtra("amt6", tot6 + "");
                  intent.putExtra("totalkg", totkg + "");
                  intent.putExtra("totalamt", totamt + "");
                  startActivity(intent);
              }
            }
        });

    }
    public static String totalAmount(EditText kgWithOperation)
    {
        String kg=kgWithOperation.getText().toString();


        int sum=0;
        String[] arr=kg.split("\\"+"+");
        for(int i=0;i< arr.length;i++)
        {

            sum+=Integer.parseInt(arr[i]);
        }

        String ret=sum+"";

        return sum+"";
    }
}