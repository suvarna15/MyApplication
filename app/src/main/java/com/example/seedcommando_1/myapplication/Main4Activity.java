package com.example.seedcommando_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b1=(Button)findViewById(R.id.b1);

        TextView tv=new TextView(this);
        tv.setText("second activity");

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2,Toast.LENGTH_LONG).show();
    }

    public void onClick(View view) {
        Intent i = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(i);
    }
}
