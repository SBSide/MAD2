package com.example.iveci.mad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
//        menu.add(0,100,0,"배경색");
//        SubMenu
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.mnyell){
        }
        else if(item.getItemId() == R.id.mnblue){
            text.setTextSize(20);
        }
        else if(item.getItemId() == R.id.mnsize){
            text.setTextSize(10);
        }
        return super.onOptionsItemSelected(item);
    }

    public void init(){
        text = (TextView) findViewById(R.id.text1);
    }
}
