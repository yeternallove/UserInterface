package cn.edu.zucc.eternallove.userinterface.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import cn.edu.zucc.eternallove.userinterface.R;

/**
 * @description:
 * @author: eternallove
 * @date: 2017/5/30 23:23
 */

public class ViewPagingActivity extends AppCompatActivity {

    private static int NUMBER_IMAGES = 4 ;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private int[] space = {R.drawable.ib_earth_normal, R.drawable.ib_jupiter_normal,R.drawable.ib_mars_normal,R.drawable.ib_neptune_normal,R.drawable.ib_venus_normal};
    private static final String[] pageTitle = {"earth","jupiter","mars","neptune","venus"};

    public static void actionStart(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, ViewPagingActivity.class);
        context.startActivity(intent);
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpaging);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        viewPagerAdapter = new ViewPagerAdapter();
        viewPager = (ViewPager) findViewById(R.id.planetViewPager);
        viewPager.setAdapter(viewPagerAdapter);
        final PagerTabStrip pagerTitle = (PagerTabStrip)findViewById(R.id.pagerTabStrip);
        pagerTitle.setTextColor(Color.CYAN);
        pagerTitle.setNonPrimaryAlpha(0.64f);
        pagerTitle.setTextSpacing(4);
        pagerTitle.setBackgroundColor(Color.DKGRAY);
        pagerTitle.setTabIndicatorColor(Color.YELLOW);

    }
    private class ViewPagerAdapter extends PagerAdapter {
        public int getCount() {
            return NUMBER_IMAGES;
        }

        public Object instantiateItem(ViewGroup imageArray, int galaxy) {
            ImageView spaceView = new ImageView(ViewPagingActivity.this);
            spaceView.setImageResource(space[galaxy]);
            ((ViewPager) imageArray).addView(spaceView, 0);
            return spaceView;
        }
        public void destroyItem(ViewGroup imageArray,int galaxy,Object spaceView){
            ((ViewPager)imageArray).removeView((ImageView) spaceView);
        }
        public boolean isViewFromObject(View spaceView, Object galaxy){
            return spaceView == ((ImageView)galaxy);
        }
        public CharSequence getPageTitle(int arrayPos){
            return pageTitle[arrayPos];
        }
        public Parcelable saveState(){
            return null;
        }
        public void restoreState(Parcelable arg0,ClassLoader arg1){}
        public void startUpdate(ViewGroup arg0){}
        public void finishUpdate(ViewGroup arg0){}
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
