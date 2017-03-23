package com.example.iveci.mad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("메뉴");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void ontheClick(View v) {
        if (v.getId() == R.id.gotopic) {
            Intent a = new Intent(Main3Activity.this, MainActivity.class);
            startActivity(a);
        }
        else if (v.getId() == R.id.gotocal) {
            Intent a = new Intent(Main3Activity.this, Main2Activity.class);
            startActivity(a);
        }
    }
}
