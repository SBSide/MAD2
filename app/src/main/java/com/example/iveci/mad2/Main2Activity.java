package com.example.iveci.mad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Linear Equation");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tabhost = (TabHost) findViewById(R.id.thost1);
        tabhost.setup();
        TabHost.TabSpec tab1 = tabhost.newTabSpec("달력").setContent(R.id.tab1)
                .setIndicator("날짜선택");
        tabhost.addTab(tab1);
        TabHost.TabSpec tab2 = tabhost.newTabSpec("시계").setContent(R.id.tab2)
                .setIndicator("선택");
        tabhost.addTab(tab2);
        tabhost.addTab(tabhost.newTabSpec("달력").setContent(R.id.tab3)
                .setIndicator("정보입력"));
        tabhost.addTab(tabhost.newTabSpec("달력").setContent(new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(Main2Activity.this,R.layout.layout2,null);

                Button btn = (Button)view.findViewById(R.id.bgo);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"GO",Toast.LENGTH_SHORT).show();
                    }
                });
                return view;
            }
        }).setIndicator("결과"));
    }
}
