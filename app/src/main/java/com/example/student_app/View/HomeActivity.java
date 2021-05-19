package com.example.student_app.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.student_app.Controller.ViewPagerAdapter;
import com.example.student_app.R;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        // Tabbed Activity
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_page);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //ViewPagerAdapter
        viewPagerAdapter.addFragment(new AddStudentFragment(), "Home");
        viewPagerAdapter.addFragment(new StudentListFragment(), "List");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_person_24);

    }
}