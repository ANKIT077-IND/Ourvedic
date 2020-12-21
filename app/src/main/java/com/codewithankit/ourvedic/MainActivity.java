package com.codewithankit.ourvedic;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2,tv3;
Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tv1=findViewById(R.id.tv1);
    tv2=findViewById(R.id.tv2);
    tv3=findViewById(R.id.tv3);
    btn1=findViewById(R.id.btn1);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,mock_Activity.class);
            startActivity(intent);
        }
    });
    }
}
