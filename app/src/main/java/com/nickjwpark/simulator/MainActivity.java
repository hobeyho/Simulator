package com.nickjwpark.simulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner CardSpinner = (Spinner) findViewById(R.id.CardSpinner);
        List<String> categories = new ArrayList<String>();
        categories.add("고해사제 페일트리스");
        categories.add("누군가가 조종하는 벌목기");
        categories.add("랩터 탈것");
        categories.add("진화의 대가");
        ArrayAdapter<String> dataAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CardSpinner.setAdapter(dataAdapter);

    }
}
