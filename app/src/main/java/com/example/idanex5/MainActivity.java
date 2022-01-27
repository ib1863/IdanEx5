package com.example.idanex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    int i, x;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pic = findViewById(R.id.one);
        i = 0;
        btn = findViewById(R.id.button);

    }

    public void clicking(View view) {
        x = (int)(3 * Math.random()+1);

        if(x==1) {
            pic.setImageResource(R.drawable.one);
            btn.setText("1");
        }
        else if(x == 2)
        {
            pic.setImageResource((R.drawable.two));
            btn.setText("2");
        }
        else
        {
            pic.setImageResource((R.drawable.three));
            btn.setText("3");
        }


    }
}