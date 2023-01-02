package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Convert(View view){
        EditText dollaramount= findViewById(R.id.editTextdollars);
        Double d1=Double.parseDouble(dollaramount.getText().toString());
        Double poundamount = d1 * 0.83;
        Toast.makeText(MainActivity.this,  "£"+poundamount.toString(), Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}