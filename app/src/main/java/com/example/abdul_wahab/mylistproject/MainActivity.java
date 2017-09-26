package com.example.abdul_wahab.mylistproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AdapterView
        ListView listView = (ListView) findViewById(R.id.list1);

        // DataSource
        String data[] = {"s1", "s2", "s3", "s4", "s2", "s3","s2", "s3", "s2", "s3","s2", "s3","s2", "s3","s2", "s3","s2", "s3",};

        // Adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        //Connect
        listView.setAdapter(arrayAdapter);

    }
}
