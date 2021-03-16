package com.example.labactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1 = (TextView)findViewById(R.id.t1);
    TextView t2;
    TextView t3;
    TextView t4;
    Button btnn;

    public int counter1=0;
    public int counter2=0;
    public int counter3=0;
    public int counter4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter1++;
        String a= "OnCreate Call" +counter1;
        t1.setText(a);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        t2=(TextView)findViewById(R.id.t2);
        counter2++;
        String b= "OnRestart call"+counter2;
        t2.setText(b);
    }

    @Override
    protected void onStart() {
        super.onStart();
        t3=(TextView)findViewById(R.id.t3);
        counter3++;
        String c= "OnStart call"+counter3;
        t3.setText(c);
    }

    @Override
    protected void onResume() {
        super.onResume();
        t4=(TextView)findViewById(R.id.t4);
        counter4++;
        String d= "OnResume call"+counter4;
        t4.setText(d);
    }
}
