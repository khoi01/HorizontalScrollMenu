package com.design.khoi.horizontalscrollmenu;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.design.khoi.horizontalscrollmenu.fragment.FragmentGreen;
import com.design.khoi.horizontalscrollmenu.fragment.FragmentGrey;
import com.design.khoi.horizontalscrollmenu.fragment.FragmentRed;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    CircleImageView profile1,profile2,profile3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize CircleImageView
        profile1 = (CircleImageView) findViewById(R.id.profile_image1);
        profile2 = (CircleImageView) findViewById(R.id.profile_image2);
        profile3 = (CircleImageView) findViewById(R.id.profile_image3);

        //set listener for each image
        profile1.setOnClickListener(this);
        profile2.setOnClickListener(this);
        profile3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //initailize Fragment manager
        FragmentManager fragmentManager = getFragmentManager();
        //initialie FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(view.equals(profile1)){

            //initialize Fragment
            FragmentGrey fragmentGrey = new FragmentGrey();
            //add fragment to transaction
            fragmentTransaction.replace(R.id.fragment_below_id,fragmentGrey);
            //start transaction
            fragmentTransaction.commit();

        }else if(view.equals(profile2)){

            //Initialize Fragment
            FragmentRed fragmentRed = new FragmentRed();
            //add fragment to transaction
            fragmentTransaction.replace(R.id.fragment_below_id,fragmentRed);
            //start transaction
            fragmentTransaction.commit();

        }else if(view.equals(profile3)){

            //Initialize Fragment
            FragmentGreen fragmentGreen = new FragmentGreen();
            //add fragment to transaction
            fragmentTransaction.replace(R.id.fragment_below_id,fragmentGreen);
            //start transaction
            fragmentTransaction.commit();
        }
    }
}
