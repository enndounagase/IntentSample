package com.websarva.wings.andrid.intentsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        ListView lvMenu = findViewById(R.id.lvMenu);
        List<Map<String,String>>menu=new ArrayList<>();
        Map<String,String>> menuList = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price","800円");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name","ハンバーグ定食");
        menu.put("price","850円");
        menuList.add(menu);

        String[] from = {"name","price"};
        int[] to = {android.R.id.text1,android.R.id.text2};
        SimpleAdapter adapter = new SimpleAdapter(MenuListActivity.this,menuList
        android.R.layout.simple_list_item_2,from,to);
        lvMenu.setAdapter(adapter);
    }
}
