package com.example.administrator.mydemo_ranking;

import android.app.Activity;
import android.os.Bundle;

import com.allen.comparsechart.CompareIndicator;

public class MainActivity extends Activity {
    CompareIndicator com1,com2,com3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com1= (CompareIndicator) findViewById(R.id.com1);
        com2= (CompareIndicator) findViewById(R.id.com2);
        com3= (CompareIndicator) findViewById(R.id.com3);

        com1.updateView(10,90);
        com2.updateView(40,60);
        com3.updateView(26,74);
    }
}
