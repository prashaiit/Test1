package com.android.praskum.test1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView1;
    Button button, button1;
    int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c =0 ;
        textView = (TextView) findViewById(R.id.welcometext);

        button = (Button) findViewById(R.id.touchHere);
        button1 = (Button) findViewById(R.id.touchHere1);
button1.setVisibility(View.INVISIBLE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == 0) {

                }
                textView.setText("Hello Sahithi.\n \t \t  How is your day today.\n \t\t\t\t Here is a small gift for you. \n \t\t\t\t Click the button to see it");
               button.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.VISIBLE);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("I Love You");
                textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 65);
                button1.setVisibility(View.INVISIBLE);
            }
        });
    }
}
