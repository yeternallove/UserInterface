package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
 * @date: 2017/5/30 23:22
 */

public class GridActivity extends AppCompatActivity{
    TextView earthText1;
    TextView earthText2;
    TextView earthText3;
    public static void actionStart(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, GridActivity.class);
        context.startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        earthText1 = (TextView)findViewById(R.id.tv1_earth);
        earthText2 = (TextView)findViewById(R.id.tv2_earth);
        earthText3 = (TextView)findViewById(R.id.tv3_earth);
        final ImageButton earthButton = (ImageButton)findViewById(R.id.ib_earth);
        final ImageButton jupiterButton = (ImageButton)findViewById(R.id.ib_jupiter);
        final ImageButton venusButton = (ImageButton)findViewById(R.id.ib_venus);

        earthButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                earthButton.setBackgroundColor(Color.argb(128,255,255,255));
                jupiterButton.setBackgroundColor(Color.argb(255,255,255,255));
                venusButton.setBackgroundColor(Color.argb(255,255,255,255));
                earthText1.setText(R.string.planet_name_earth);
                earthText2.setText(R.string.planet_mass_earth);
                earthText3.setText(R.string.planet_grav_earth);
            }});
        jupiterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                earthButton.setBackgroundColor(Color.argb(255,255,255,255));
                jupiterButton.setBackgroundColor(Color.argb(128,255,255,255));
                venusButton.setBackgroundColor(Color.argb(255,255,255,255));
                earthText1.setText(R.string.planet_name_jupiter);
                earthText2.setText(R.string.planet_mass_jupiter);
                earthText3.setText(R.string.planet_grav_jupiter);
            }});
        venusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                earthButton.setBackgroundColor(Color.argb(255,255,255,255));
                jupiterButton.setBackgroundColor(Color.argb(255,255,255,255));
                venusButton.setBackgroundColor(Color.argb(128,255,255,255));
                earthText1.setText(R.string.planet_name_venus);
                earthText2.setText(R.string.planet_mass_venus);
                earthText3.setText(R.string.planet_grav_venus);
            }});

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
