package com.example.andriod.freelithics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import static com.example.andriod.freelithics.R.id.viewpager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ICONS = new int[]{
                R.drawable.learn_the_movements,
                R.drawable.training,
                R.drawable.coach,
                R.drawable.profile
        };
        final int[] TITLES = new int[]{
                R.string.tab1,
                R.string.tab2,
                R.string.tab3,
                R.string.tab4
        };
        final ViewPager viewPager = (ViewPager) findViewById(viewpager);
        categoryAdapter adapter = new categoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(ICONS[0]);
        tabLayout.getTabAt(1).setIcon(ICONS[1]);
        tabLayout.getTabAt(2).setIcon(ICONS[2]);
        tabLayout.getTabAt(3).setIcon(ICONS[3]);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // change your title
                // inflate menu
                // customize your toolbar
                setTitle(TITLES[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
