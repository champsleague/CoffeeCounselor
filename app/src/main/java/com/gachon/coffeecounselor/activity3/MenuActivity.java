package com.gachon.coffeecounselor.activity3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.gachon.coffeecounselor.CafeinfoActivity;
import com.gachon.coffeecounselor.R;
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
            switch (CafeinfoActivity.cafe_change){
                case 0:{ //starbucks

                }
                case 1:{ //twosome

                }
                case 2:{ //megacoffee
                    VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                    vpAdapter.addFragment(new MegaCoffeeFragment(), "coffee");
                    vpAdapter.addFragment(new MegaBeverageFragment(), "beverage");
                    vpAdapter.addFragment(new MegaTeaFragment(), "tea");
                    vpAdapter.addFragment(new MegaDessertFragment(), "dessert");
                    viewPager.setAdapter(vpAdapter);
                }
                case 3:{ //ediya

                }
                case 4:{ //pascucci
                    /*
                    VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                    vpAdapter.addFragment(new PascucciCoffeeFragment(), "coffee");
                    vpAdapter.addFragment(new  MegaBeverageFragment(), "beverage");
                    vpAdapter.addFragment(new  MegaTeaFragment(), "tea");
                    vpAdapter.addFragment(new  MegaDessertFragment(), "dessert");
                    viewPager.setAdapter(vpAdapter);

                    */
                }
            }
    }
}
