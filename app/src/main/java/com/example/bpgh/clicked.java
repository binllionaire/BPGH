package com.example.bpgh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Elizabeth on 2016-11-24.
 */
public class clicked extends Activity {
    private int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */
        setContentView(R.layout.clicked);

        Intent intent = getIntent();
        ImageView profile = (ImageView) findViewById(R.id.img_prof);
        TextView info=(TextView) findViewById(R.id.tv_info);

        img=Integer.parseInt(intent.getStringExtra("profile"));
        profile.setImageResource(img);
        info.setText(intent.getStringExtra("info"));

    }
}
