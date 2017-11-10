package com.design.khoi.horizontalscrollmenu.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.design.khoi.horizontalscrollmenu.R;

/**
 * Created by User on 11/11/2017.
 */

public class FragmentGrey extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grey_fragment,container,false);

        return view;
    }
}
