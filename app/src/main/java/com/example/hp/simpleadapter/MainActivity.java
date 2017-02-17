package com.example.hp.simpleadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ListView listView=null;
    Map<String,String>item1=new HashMap<String,String>();
    Map<String,String>item2=new HashMap<String,String>();
    Map<String,String>item3=new HashMap<String,String>();

    List<Map<String,String>>data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        item1.put("nom","Mouad");
        item1.put("tel","0707221994");
        data.add(item1);
        item2.put("nom","Mohcine");
        item2.put("tel","0621234556");
        data.add(item2);
        item3.put("nom","Souto");
        item3.put("tel","0612546720");
        data.add(item3);
        SimpleAdapter adapter=new SimpleAdapter(this,data,R.layout.itemx,new String[]{"nom","tel"},new int[]{R.id.nom,R.id.tel});
        listView.setAdapter(adapter);





    }
}
