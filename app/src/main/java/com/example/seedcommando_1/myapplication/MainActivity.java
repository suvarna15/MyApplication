package com.example.seedcommando_1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= (TextView)findViewById(R.id.t1);
        textView.setText("hello");
        Button button=(Button)findViewById(R.id.button2);
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
        Log.d("msg", "The onCreate() event ");

    }

    @Override
    protected void onStart() {
        Log.d("msg", "onStart: ");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.d("msg", "onPostResume: ");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.d("msg", "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("msg", "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("msg", "onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("msg", "onRestart: ");
        super.onRestart();
    }

    /*for creating menu*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    /* for selecting menu after that show toast msg*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu1:
                Toast.makeText(this,"menu successfully added",Toast.LENGTH_LONG).show();
            case R.id.menu2:
                Toast.makeText(this,"menu successfully updated",Toast.LENGTH_LONG).show();
            case R.id.menu3:
                Toast.makeText(this,"menu successfully deleted",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
