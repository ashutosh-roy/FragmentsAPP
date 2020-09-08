package com.example.lab15_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements Thoughts.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tabSummer = findViewById(R.id.Summer);
        TabItem tabWinter = findViewById(R.id.Winter);
        TabItem tabRainy = findViewById(R.id.Rainy);
        TabItem tabAutumn = findViewById(R.id.Autumn);
        final ViewPager viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                          tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


    @Override
    public void sendData(String message) {
       // String tag = "android:switcher:" + R.id.viewpager + ":" + 1;
        Favourites f = (Favourites) getSupportFragmentManager().findFragmentById(R.id.viewpager);
        f.displayReceivedData(message);

    }
}