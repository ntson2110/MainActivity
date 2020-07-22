package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed_ten;
    Button btn_ok;
    TextView tv_hienthi;
    String str_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_ten = (EditText) findViewById(R.id.et_ten);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        tv_hienthi = (TextView) findViewById(R.id.tv_hienthi);

        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewID=v.getId();
        if (viewID==R.id.btn_ok){
            str_ten=ed_ten.getText().toString().trim();
            String name="Xin chào" + " " + str_ten ;
            tv_hienthi.setText(name);
        }
    }
}