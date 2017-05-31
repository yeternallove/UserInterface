package cn.edu.zucc.eternallove.userinterface.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import cn.edu.zucc.eternallove.userinterface.R;
import cn.edu.zucc.eternallove.userinterface.ui.activities.DrawerActivity;
import cn.edu.zucc.eternallove.userinterface.ui.activities.GridActivity;
import cn.edu.zucc.eternallove.userinterface.ui.activities.LinearActivity;
import cn.edu.zucc.eternallove.userinterface.ui.activities.SlidingPaneActivity;
import cn.edu.zucc.eternallove.userinterface.ui.activities.ViewPagingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.linear_layout:
                LinearActivity.actionStart(this);
                break;
            case R.id.grid_layout:
                GridActivity.actionStart(this);
                break;
            case R.id.drawer_layout:
                DrawerActivity.actionStart(this);
                break;
            case R.id.sliding_layout:
                SlidingPaneActivity.actionStart(this);
                break;
            case R.id.paging_layout:
                ViewPagingActivity.actionStart(this);
                break;
        }
        return true;
    }
}

