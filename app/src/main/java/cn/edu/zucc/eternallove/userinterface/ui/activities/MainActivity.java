package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.TextView;

import cn.edu.zucc.eternallove.userinterface.R;
import cn.edu.zucc.eternallove.userinterface.ui.fragments.AnalogFragment;
import cn.edu.zucc.eternallove.userinterface.ui.fragments.DigitalFragment;

public class MainActivity extends Activity {
    AnalogClock analogClock;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar tabsActionBar = getActionBar();
        tabsActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tabArray = tabsActionBar.newTab();
        tabArray.setText(R.string.tab_one);
        tabArray.setTabListener(new clockTabListener(this, DigitalFragment.class.getName()));
        tabsActionBar.addTab(tabArray);
        tabArray = tabsActionBar.newTab();
        tabArray.setText(R.string.tab_two);
        tabArray.setTabListener(new clockTabListener(this, AnalogFragment.class.getName()));
        tabsActionBar.addTab(tabArray);
    }

    private class clockTabListener implements ActionBar.TabListener {
        private final Activity currentActivity;
        private final String currentFragment;
        private Fragment launchFragment;

        public clockTabListener(Activity activityName, String fragmentName) {
            currentActivity = activityName;
            currentFragment = fragmentName;
        }

        public void onTabReselected(ActionBar.Tab arg0, FragmentTransaction arg1) {

        }

        public void onTabSelected(ActionBar.Tab arg0, FragmentTransaction arg1) {
            launchFragment = Fragment.instantiate(currentActivity, currentFragment);
            arg1.add(android.R.id.content, launchFragment);
        }

        public void onTabUnselected(ActionBar.Tab arg0, FragmentTransaction arg1) {
            arg1.remove(launchFragment);
            launchFragment = null;

        }

    }
}

//    @BindView(R.id.analogClock)     AnalogClock analogClock;
//    @BindView(R.id.btn_clockGone)   Button btnclockGone;
//    @BindView(R.id.btn_clockInv)    Button btnclockInVic;
//    @BindView(R.id.btn_clockvis)    Button btnclockVic;
//    @BindView(R.id.textview)        TextView text;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//        registerForContextMenu(analogClock);
//        text.setOnClickListener(this);
//        btnclockGone.setOnClickListener(this);
//        btnclockInVic.setOnClickListener(this);
//        btnclockVic.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.btn_clockGone:
//                analogClock.setVisibility(View.GONE);
//                break;
//            case R.id.btn_clockInv:
//                analogClock.setVisibility(View.INVISIBLE);
//                break;
//            case R.id.btn_clockvis:
//                analogClock.setVisibility(View.VISIBLE);
//                break;
//            case R.id.textview:
//                PopupMenu popupMenu = new PopupMenu(MainActivity.this,text);
//                popupMenu.getMenuInflater().inflate(R.menu.main_popup,popupMenu.getMenu());
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
//                    public  boolean onMenuItemClick(MenuItem item){
//                        switch (item.getItemId()){
//                            case R.id.viz:
//                                analogClock.setVisibility(View.VISIBLE);
//                                break;
//                            case R.id.inviz:
//                                analogClock.setVisibility(View.INVISIBLE);
//                                break;
//                            case R.id.gone:
//                                analogClock.setVisibility(View.GONE);
//                                break;
//                        }
//                        return false;
//                    }
//                });
//                popupMenu.show();
//            default:break;
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_red:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
//                return true;
//            case R.id.action_org:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
//                return true;
//            case R.id.action_yel:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
//                return true;
//            case R.id.action_grn:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
//                return true;
//            case R.id.action_blu:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
//                return true;
//            case R.id.action_pur:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
//                return true;
//            case R.id.action_wht:
//                analogClock.setBackgroundColor(Color.WHITE);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//    @Override
//    public void onCreateContextMenu(ContextMenu contextMenu, View v, ContextMenu.ContextMenuInfo menuInfo){
//        getMenuInflater().inflate(R.menu.main_context,contextMenu);
//    }
//    @Override
//    public boolean onContextItemSelected(MenuItem item){
//        switch (item.getItemId()) {
//            case R.id.action_red:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
//                return true;
//            case R.id.action_org:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
//                return true;
//            case R.id.action_yel:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
//                return true;
//            case R.id.action_grn:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
//                return true;
//            case R.id.action_blu:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
//                return true;
//            case R.id.action_pur:
//                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
//                return true;
//            case R.id.action_wht:
//                analogClock.setBackgroundColor(Color.WHITE);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }