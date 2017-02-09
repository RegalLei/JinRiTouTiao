package com.bawei.jinritoutiao;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.bawei.jinritoutiao.Fragment.FragmentAttention;
import com.bawei.jinritoutiao.Fragment.FragmentHome;
import com.bawei.jinritoutiao.Fragment.FragmentMy;
import com.bawei.jinritoutiao.Fragment.FragmentVideo;

public class MainActivity extends AppCompatActivity {

    private Button btn_main_my;
    private Button btn_main_attention;
    private Button btn_main_video;
    private Button btn_main_home;
    private FragmentManager fragmentManager;
    private FragmentHome fragmentHome;
    private FragmentVideo fragmentVideo;
    private FragmentAttention fragmentAttention;
    private FragmentMy fragmentMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgit();
    }

    private void initWidgit() {
        btn_main_home = (Button) findViewById(R.id.btn_main_home);
        btn_main_video = (Button) findViewById(R.id.btn_main_video);
        btn_main_attention = (Button) findViewById(R.id.btn_main_attention);
        btn_main_my = (Button) findViewById(R.id.btn_main_my);

        fragmentManager = getSupportFragmentManager();
        fragmentHome = new FragmentHome();
        fragmentVideo = new FragmentVideo();
        fragmentAttention = new FragmentAttention();
        fragmentMy = new FragmentMy();
    }

    public void addlist(){
        for (int i = 0; i <4; i++) {
            ShowFragment showFragment =new ShowFragment();
            switch (i){
                case 0:
                    showFragment.fragment=fragmentHome;
                    break;
                case 1:
                    showFragment.fragment=fragmentVideo;
                    break;
                case 2:
                    showFragment.fragment=fragmentAttention;
                    break;
                case 3:
                    showFragment.fragment=fragmentMy;
                    break;
            }

        }
    }

}
