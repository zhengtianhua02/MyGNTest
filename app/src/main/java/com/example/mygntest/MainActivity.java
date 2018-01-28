package com.example.mygntest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends Activity implements TabLayout.OnTabSelectedListener{


    @BindView(R.id.tb)
    TabLayout tablayout;

    TextView titleContent1;
    TextView titleContent2;
    ImageView iv_home;
    ImageView iv_my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }
    public void init(){

        tablayout.addTab(tablayout.newTab().setCustomView(R.layout.title_item));
        titleContent1=(TextView) findViewById(R.id.tv_tabTitle);
        iv_home=(ImageView) findViewById(R.id.iv_home);
        titleContent1.setText("首页");
        titleContent1.setTextColor(Color.RED);
        titleContent1.setTextSize(12);

        tablayout.addTab(tablayout.newTab().setCustomView(R.layout.title_item2));
        titleContent2=(TextView) findViewById(R.id.tv_tabTitle2);
        iv_my=(ImageView) findViewById(R.id.iv_my);
        titleContent2.setText("我的");
        titleContent2.setTextSize(12);


//        tb.addTab(tb.newTab().setText("这是第一个table").setIcon(R.mipmap.home1));
//        tb.addTab(tb.newTab().setText("这是第二个table").setIcon(R.mipmap.my1));
//        tb.addTab(tb.newTab().setText("这是第三个table"));
//        tb.addTab(tb.newTab().setText("这是第四个table"));
//        tb.addTab(tb.newTab().setText("这是第五个table"));
        tablayout.setOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()){
            case 0:
                titleContent1.setTextColor(Color.RED);
                iv_home.setImageResource(R.mipmap.home2);
                break;
            case 1:
                titleContent2.setTextColor(Color.RED);
                iv_my.setImageResource(R.mipmap.my2);
                break;

        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        titleContent1.setTextColor(Color.BLACK);
        iv_home.setImageResource(R.mipmap.home1);
        titleContent2.setTextColor(Color.BLACK);
        iv_my.setImageResource(R.mipmap.my1);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
