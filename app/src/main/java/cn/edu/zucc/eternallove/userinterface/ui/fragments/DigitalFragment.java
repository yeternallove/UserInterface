package cn.edu.zucc.eternallove.userinterface.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.zucc.eternallove.userinterface.R;

/**
 * @description:
 * @author: eternallove
 * @date: 2017/3/22 15:14
 */

public class DigitalFragment extends Fragment {
    public View onCreateView(LayoutInflater digitalClock, ViewGroup digClockLayout, Bundle savedInstanceState){
        return digitalClock.inflate(R.layout.fragment_digital,digClockLayout,false);
    }
}

