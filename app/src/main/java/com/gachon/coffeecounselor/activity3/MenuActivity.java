package com.gachon.coffeecounselor.activity3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.gachon.coffeecounselor.R;
import com.gachon.coffeecounselor.activity3.BeverageFragment;
import com.gachon.coffeecounselor.activity3.CoffeeFragment;
import com.gachon.coffeecounselor.activity3.DessertFragment;
import com.gachon.coffeecounselor.activity3.TeaFragment;
import com.gachon.coffeecounselor.activity3.VPAdapter;
import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;


public class MenuActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

            tabLayout.setupWithViewPager(viewPager);

            VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            vpAdapter.addFragment(new CoffeeFragment(), "coffee");
            vpAdapter.addFragment(new BeverageFragment(), "beverage");
            vpAdapter.addFragment(new TeaFragment(), "tea");
            vpAdapter.addFragment(new DessertFragment(), "dessert");
            viewPager.setAdapter(vpAdapter);

    }
}
