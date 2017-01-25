package com.example.seedcommando_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {
    EditText et1;
    Button b1;
    TextView t1;
   /* ArrayAdapter<String> ad;
    ArrayList<String> a;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t1=(TextView)findViewById(R.id.t1);
        b1=(Button)findViewById(R.id.b1);
        et1=(EditText)findViewById(R.id.et1);
    }

    public void onClick(View view)
    {
        String message=et1.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("MESSAGE",message);
        setResult(2,intent);
        finish();//finishing activity
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.Main6, menu);
        return true;
    }*/
}
