package com.example.acer.testtodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.ListView);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_checked, items);
        lvItems.setAdapter(itemsAdapter);

        items.add("First");
        items.add("Second");
        items.add("Third");
        items.add("Fourth");

        //setupListViewListener();

    }

    public void onAddItem(View v){
        EditText etNewItem = (EditText) findViewById(R.id.editText);
        String itemText = etNewItem.getText().toString();
        itemsAdapter.add(itemText);
        etNewItem.setText("");
    }

    /*
    private void setupListViewListener(){
        lvItems.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener(){
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                        items.remove(position);
                        itemsAdapter.notifyDataSetChanged();
                        return false;
                    }
                }
        );
        lvItems.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        CheckedTextView textView = (CheckedTextView) view;
                        textView.setChecked(!textView.isChecked());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }

                }
        );
    }*/


}
