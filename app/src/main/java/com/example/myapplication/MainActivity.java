package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> adspin;
    boolean minitSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setPrompt("프로그래밍 언어를 선택하세요");

        adspin = ArrayAdapter.createFromResource(this.R.array.languages, android.R.layout.simple_spinner_item);
        adspin.setDropDownViewResource(android.R.layout.simple_list_item_single_single_choice);
        spin.setAdapter(adspin);

        spin.setOnItemSelectedListener(new AdapterView.OnitemSelectedListener() {
            public void onItemSelected(AdapterVIew<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, adspin.getItem(position) + "선택!!", Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterVIew<?> parent) {
            }
        });
    }
}
