package com.example.seedcommando_1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    TextView t1;
    Button b1;
    ListView lv1;
   /* ArrayList a;
    ArrayAdapter ad;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
         t1=(TextView)findViewById(R.id.t1);
         b1 =(Button)findViewById(R.id.b1);
        lv1=(ListView)findViewById(R.id.lv1);

       /* a = new ArrayList<String>();
         ad= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, a);
        lv1.setAdapter(ad);

        registerForContextMenu(lv1);
*/

    }

    public  void onClick(View view){

        Intent intent=new Intent(Main5Activity.this,Main6Activity.class);
        startActivityForResult(intent, 2);// Activity is started with requestCode 2
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            t1.setText(message);


        }
    }


   /* @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        //return true;
    }*/

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
*/

}
