package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import cn.edu.zucc.eternallove.userinterface.R;

/**
 * @description:
 * @author: eternallove
 * @date: 2017/5/30 23:22
 */

public class SlidingPaneActivity extends AppCompatActivity {
    LinearLayout uiPaneLinearLayout;
    ImageView planetImageView;
    TextView planetText1;
    TextView planetText2;
    TextView planetText3;
    public static void actionStart(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, SlidingPaneActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slidingpane);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        uiPaneLinearLayout = (LinearLayout)findViewById(R.id.uiPane);
        planetImageView = (ImageView)findViewById(R.id.iv1);
        planetText1 = (TextView)findViewById(R.id.tv1);
        planetText2 = (TextView)findViewById(R.id.tv2);
        planetText3 = (TextView)findViewById(R.id.tv3);
        ImageButton earthButton = (ImageButton)findViewById(R.id.ib_earth);
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //uiPaneLinearLayout.setBackgroundResource(R.drawable.b);
                planetImageView.setBackgroundResource(R.drawable.ib_earth_normal);
                planetText1.setText(R.string.planet_name_earth);
                planetText2.setText(R.string.planet_mass_earth);
                planetText3.setText(R.string.planet_grav_earth);
            }
        });
        ImageButton jupiterButton = (ImageButton)findViewById(R.id.ib_jupiter);
        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //uiPaneLinearLayout.setBackgroundResource(R.drawable.b);
                planetImageView.setBackgroundResource(R.drawable.ib_jupiter_normal);
                planetText1.setText(R.string.planet_name_jupiter);
                planetText2.setText(R.string.planet_mass_jupiter);
                planetText3.setText(R.string.planet_grav_jupiter);
            }
        });

        ImageButton venusButton = (ImageButton)findViewById(R.id.ib_venus);
        venusButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                // uiPaneLinearLayout.setBackgroundResource(R.drawable.b);
                planetImageView.setBackgroundResource(R.drawable.ib_venus_normal);
                planetText1.setText(R.string.planet_name_venus);
                planetText2.setText(R.string.planet_mass_venus);
                planetText3.setText(R.string.planet_grav_venus);
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
