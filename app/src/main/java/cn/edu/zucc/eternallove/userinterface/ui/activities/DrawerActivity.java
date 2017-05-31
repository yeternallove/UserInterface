package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import cn.edu.zucc.eternallove.userinterface.R;

/**
 * @description:
 * @author: eternallove
 * @date: 2017/5/30 23:22
 */

public class DrawerActivity extends AppCompatActivity {
    private String[] drawerLayoutListItem;
    private ListView drawerLayoutListView;
    private DrawerLayout myDrawerLayout;
    private ImageView plantImageView;
    TextView planetText1;
    TextView planetText2;
    TextView planetText3;

    public static void actionStart(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, DrawerActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        plantImageView=(ImageView)findViewById(R.id.iv1);
        planetText1=(TextView)findViewById(R.id.tv1);
        planetText2=(TextView)findViewById(R.id.tv2);
        planetText3=(TextView)findViewById(R.id.tv3);
        myDrawerLayout=(DrawerLayout)findViewById(R.id.draverLayout);
        drawerLayoutListItem=getResources().getStringArray(R.array.planets);
        drawerLayoutListView=(ListView)findViewById(R.id.listView);
        drawerLayoutListView.setAdapter(new ArrayAdapter<String>(this,R.layout.listview_planet_textview,drawerLayoutListItem));
        drawerLayoutListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                switch (arg2){
                    case 0:
                        plantImageView.setBackgroundResource(R.drawable.ib_earth_normal);
                        planetText1.setText(R.string.planet_name_earth);
                        planetText2.setText(R.string.planet_mass_earth);
                        planetText3.setText(R.string.planet_grav_earth);
                        break;
                    case 1:
                        plantImageView.setBackgroundResource(R.drawable.ib_venus_normal);
                        planetText1.setText(R.string.planet_name_venus);
                        planetText2.setText(R.string.planet_mass_venus);
                        planetText3.setText(R.string.planet_grav_venus);
                        break;
                    case 2:
                        plantImageView.setBackgroundResource(R.drawable.ib_jupiter_normal);
                        planetText1.setText(R.string.planet_name_jupiter);
                        planetText2.setText(R.string.planet_mass_jupiter);
                        planetText3.setText(R.string.planet_grav_jupiter);
                        break;
                }
                myDrawerLayout.closeDrawer(drawerLayoutListView);
                return;

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
