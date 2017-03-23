package com.example.iveci.mad2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text1);
        registerForContextMenu(text);


    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v == text){
            getMenuInflater().inflate(R.menu.menu2, menu);

        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {//Contextmenu 선택시
        switch (item.getItemId()) {
            case R.id.mnyell:
                text.setBackgroundColor(Color.YELLOW);
                break;
        }
        return super.onContextItemSelected(item);
    }

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu2, menu);
////        menu.add(0,100,0,"배경색");
////        SubMenu
//        return super.onCreateOptionsMenu(menu);
//    }


    //    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId() == R.id.mnyell){
//        }
//        else if(item.getItemId() == R.id.mnblue){
//            text.setTextSize(20);
//        }
//        else if(item.getItemId() == R.id.mnsize){
//            text.setTextSize(10);
//        }
//        return super.onOptionsItemSelected(item);
//    }

}
