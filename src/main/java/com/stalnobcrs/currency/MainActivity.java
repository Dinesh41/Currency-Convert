package com.stalnobcrs.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view)
    {
        EditText ru=(EditText)findViewById(R.id.rupee);
        Log.i("Amount",ru.getText().toString());
        Double r=Double.parseDouble(ru.getText().toString());
        Toast.makeText(MainActivity.this,String.format("%.2f",r*0.015)+"$",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
