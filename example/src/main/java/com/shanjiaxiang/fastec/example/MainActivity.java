package com.shanjiaxiang.fastec.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.shanjiaxiang.latte.app.Latte;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(Latte.getApplication(),"传入context",Toast.LENGTH_SHORT).show();
    }
}
