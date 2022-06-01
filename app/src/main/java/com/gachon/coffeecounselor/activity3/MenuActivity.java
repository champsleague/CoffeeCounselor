package com.gachon.coffeecounselor.activity3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.gachon.coffeecounselor.CafeinfoActivity;
import com.gachon.coffeecounselor.R;
import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


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
                    Toast.makeText(this.getApplicationContext(),"Starbucks",Toast.LENGTH_SHORT).show();
                    break;

                }
                case 1:{ //twosome
                    Toast.makeText(this.getApplicationContext(),"A TWOSOME PLACE",Toast.LENGTH_SHORT).show();
                    break;
                }
                case 2:{ //megacoffee
                    Toast.makeText(this.getApplicationContext(),"Mega Coffee",Toast.LENGTH_SHORT).show();
                    VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                    vpAdapter.addFragment(new MegaCoffeeFragment(), "coffee");
                    vpAdapter.addFragment(new MegaBeverageFragment(), "beverage");
                    vpAdapter.addFragment(new MegaTeaFragment(), "tea");
                    vpAdapter.addFragment(new MegaDessertFragment(), "dessert");
                    viewPager.setAdapter(vpAdapter);
                    break;
                }
                case 3:{ //ediya
                    Toast.makeText(this.getApplicationContext(),"EDIYA COFFEE",Toast.LENGTH_SHORT).show();
                    break;
                }
                case 4:{ //pascucci
                    Toast.makeText(this.getApplicationContext(),"PASCUCCI",Toast.LENGTH_SHORT).show();
                    VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
                    vpAdapter.addFragment(new PascucciCoffeeFragment(), "coffee");
                    vpAdapter.addFragment(new  MegaBeverageFragment(), "beverage");
                    vpAdapter.addFragment(new  MegaTeaFragment(), "tea");
                    vpAdapter.addFragment(new  MegaDessertFragment(), "dessert");
                    viewPager.setAdapter(vpAdapter);
                    break;
                }
                default:
                    break;
            }
    }
}
