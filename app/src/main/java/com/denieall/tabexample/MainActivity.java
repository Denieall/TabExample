package com.denieall.tabexample;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab_basic;
    private TextView title_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0f);

        title_tv = findViewById(R.id.title_tv);
        tab_basic = findViewById(R.id.basic_tab);

        tab_basic.addTab(tab_basic.newTab().setText("Movies"));
        tab_basic.addTab(tab_basic.newTab().setText("Music"));

        // Set color for when tab is not selected and selected
        tab_basic.setTabTextColors(Color.WHITE, getColor(R.color.colorAccent));

        tab_basic.setBackgroundColor(getColor(R.color.colorPrimary));

        tab_basic.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                title_tv.setText(tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
