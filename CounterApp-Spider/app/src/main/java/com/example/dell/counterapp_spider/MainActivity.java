package com.example.dell.counterapp_spider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inc(View view){
        TextView textView = (TextView) findViewById(R.id.text);
        Integer n;
        n = Integer.parseInt(textView.getText().toString());
        n = n+1;
        textView.setText("" + n);

    }
}
