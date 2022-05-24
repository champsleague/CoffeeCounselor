package com.gachon.coffeecounselor;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MenuActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        com.gachon.coffeecounselor.VPAdapter vpAdapter = new com.gachon.coffeecounselor.VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new CoffeeFragment(), "coffee");
        vpAdapter.addFragment(new BeverageFragment(), "beverage");
        vpAdapter.addFragment(new TeaFragment(), "tea");
        vpAdapter.addFragment(new DessertFragment(), "dessert");
        viewPager.setAdapter(vpAdapter);

    }
}
