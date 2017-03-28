package com.example.iveci.mad2;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    TextView t1,t2;
    LinearLayout limain,li1,li2;
    ImageView i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("메뉴를 눌러보세요");
        setContentView(R.layout.activity_main);
        init();
//        registerForContextMenu(text);


    }


//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        if(v == text){
//            getMenuInflater().inflate(R.menu.menu2, menu);
//
//        }
//        super.onCreateContextMenu(menu, v, menuInfo);
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {//Contextmenu 선택시
//        switch (item.getItemId()) {
//            case R.id.mnyell:
//                text.setBackgroundColor(Color.YELLOW);
//                break;
//        }
//        return super.onContextItemSelected(item);
//    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
////        menu.add(0,100,0,"배경색");
////        SubMenu
        return super.onCreateOptionsMenu(menu);
    }


        @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.mnsred:{
                    limain.setBackgroundColor(Color.RED);
                    break;
                }
                case R.id.mnsblu:{
                    limain.setBackgroundColor(Color.BLUE);
                    break;
                }
                case R.id.mnsyel:{
                    limain.setBackgroundColor(Color.YELLOW);
                    break;
                }
                case R.id.mn30dg:{
                    if (li1.getVisibility() == View.VISIBLE) i1.setRotation(i1.getRotation()+30);
                    else i2.setRotation(i2.getRotation()+30);
                    break;
                }
                case R.id.mntitle:{
                    if (item.isChecked()) {
                        t1.setVisibility(View.INVISIBLE);
                        t2.setVisibility(View.INVISIBLE);
                        item.setChecked(false);
                    }
                    else if (!item.isChecked()) {
                        t1.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.VISIBLE);
                        item.setChecked(true);
                    }
                    break;
                }
                case R.id.mnzoom:{

                    if (!item.isChecked()) {
                        i1.setScaleX(i2.getScaleX()*2);
                        i1.setScaleY(i2.getScaleY()*2);
                        i2.setScaleX(i2.getScaleX()*2);
                        i2.setScaleY(i2.getScaleY()*2);
                        item.setChecked(true);
                    }
                    else if (item.isChecked()) {
                        i1.setScaleX(i1.getScaleX() / 2);
                        i1.setScaleY(i1.getScaleY() / 2);
                        i2.setScaleX(i2.getScaleX() / 2);
                        i2.setScaleY(i2.getScaleY() / 2);
                        item.setChecked(false);
                    }
                    break;
                }
                case R.id.mnchi:{
                    item.setChecked(true);
                    li1.setVisibility(View.VISIBLE);
                    i2.setRotation(0);
                    li2.setVisibility(View.INVISIBLE);
                    break;
                }
                case R.id.mnspa:{
                    item.setChecked(true);
                    li2.setVisibility(View.VISIBLE);
                    i2.setRotation(0);
                    li1.setVisibility(View.INVISIBLE);
                    break;
                }
            }
        return super.onOptionsItemSelected(item);
    }

    public void init(){
        t1 = (TextView) findViewById(R.id.tdchik);
        t2 = (TextView) findViewById(R.id.tdspag);
        limain = (LinearLayout) findViewById(R.id.linmain) ;
        li1 = (LinearLayout) findViewById(R.id.linchi);
        li2 = (LinearLayout) findViewById(R.id.linspa);
        i1 = (ImageView) findViewById(R.id.chicken);
        i2 = (ImageView) findViewById(R.id.spagetti);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}
