package com.example.iveci.mad2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.iveci.mad2.R.id.bcbmi;
import static com.example.iveci.mad2.R.id.bconvms_p;
import static com.example.iveci.mad2.R.id.bconvp_ms;
import static com.example.iveci.mad2.R.id.eweight;

public class Main2Activity extends AppCompatActivity {
    TabHost tabhost;
    EditText tal,wei,mil;
    TextView res,convres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("각종 계산기");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init() {
        tal = (EditText) findViewById(R.id.etall);
        wei = (EditText) findViewById(R.id.eweight);
        mil = (EditText) findViewById(R.id.emil);
        res = (TextView) findViewById(R.id.tresult);
        convres = (TextView) findViewById(R.id.tconvr);
        tabhost = (TabHost) findViewById(R.id.thost1);
        tabhost.setup();
        tabhost.addTab(tabhost.newTabSpec("BMI").setContent(R.id.tab1)
                .setIndicator("BMI계산기"));
        tabhost.addTab(tabhost.newTabSpec("면적").setContent(R.id.tab2)
                .setIndicator("면적 계산기"));
    }

    public void onyourclick(View v){
        switch (v.getId()) {
            case bcbmi: {
                if (tal.getText().toString().equals("") || wei.getText().toString().equals("")){
                    res.setText("결과가 없습니다.");
                    break;
                }
                String tall = tal.getText().toString().equals("0") ? "1" : tal.getText().toString();//div0 방지
                String weight = wei.getText().toString();
                double result = Double.parseDouble(weight) /
                        ((Double.parseDouble(tall) / 100) * (Double.parseDouble(tall) / 100));
                if (0 <= result && result < 18.5) {
                    res.setText("체중부족입니다!");
                    res.setTextColor(Color.BLACK);
                }
                else if (18.5 <= result && result <= 22.9) {
                    res.setText("정상입니다.");
                    res.setTextColor(Color.BLUE);
                }
                else if (23.0 <= result && result <= 24.9) {
                    res.setText("과체중입니다.");
                    res.setTextColor(Color.RED);
                }
                else {
                    res.setText("비만입니다!");
                    res.setTextColor(Color.RED);
                }
                break;
            }
            case bconvp_ms: {
                String area = mil.getText().toString().equals("") ? "0" : mil.getText().toString();
                double res = Double.parseDouble(area) * 3.305785;
                convres.setText(res + " 제곱미터");
                break;
            }
            case bconvms_p: {
                String area = mil.getText().toString().equals("") ? "0" : mil.getText().toString();
                double res = Double.parseDouble(area) * 0.3025;
                convres.setText(res + " 평");
                break;
            }
        }
    }
}
