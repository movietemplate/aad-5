package com.example.exp5_551;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv=(TextView) findViewById(R.id.textView1);
        TextView tv1=(TextView) findViewById(R.id.textView2);
        tv.setText(getIntent().getExtras().getString("uname"));
        tv1.setText(getIntent().getExtras().getString("pwd"));
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);+
        return true;
    }
}