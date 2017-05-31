package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import cn.edu.zucc.eternallove.userinterface.R;

/**
 * @description:
 * @author: eternallove
 * @date: 2017/5/30 23:18
 */

public class LinearActivity extends AppCompatActivity {
    TextView earthText2;
    TextView earthText3;
    TextView venusText2;
    TextView venusText3;
    TextView jupiterText2;
    TextView jupiterText3;

    public static void actionStart(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, LinearActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        earthText2 = (TextView)findViewById(R.id.tv2_earth);
        earthText3 = (TextView)findViewById(R.id.tv3_earth);
        venusText2 = (TextView)findViewById(R.id.tv2_venus);
        venusText3 = (TextView)findViewById(R.id.tv3_venus);
        jupiterText2 = (TextView)findViewById(R.id.tv2_jupiter);
        jupiterText3 = (TextView)findViewById(R.id.tv3_jupiter);
        ImageButton earthButton = (ImageButton)findViewById(R.id.ib_earth);
        earthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                earthText2.setVisibility(View.VISIBLE);
                earthText3.setVisibility(View.VISIBLE);
                venusText2.setVisibility(View.GONE);
                venusText3.setVisibility(View.GONE);
                jupiterText2.setVisibility(View.GONE);
                jupiterText3.setVisibility(View.GONE);
            }
        });
        ImageButton venusButton = (ImageButton)findViewById(R.id.ib_venus);
        venusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                earthText2.setVisibility(View.GONE);
                earthText3.setVisibility(View.GONE);
                venusText2.setVisibility(View.VISIBLE);
                venusText3.setVisibility(View.VISIBLE);
                jupiterText2.setVisibility(View.GONE);
                jupiterText3.setVisibility(View.GONE);
            }
        });
        ImageButton jupiterButton = (ImageButton)findViewById(R.id.ib_jupiter);
        jupiterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                earthText2.setVisibility(View.GONE);
                earthText3.setVisibility(View.GONE);
                venusText2.setVisibility(View.GONE);
                venusText3.setVisibility(View.GONE);
                jupiterText2.setVisibility(View.VISIBLE);
                jupiterText3.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
