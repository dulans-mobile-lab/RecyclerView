package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //    vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: started");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");

        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");

        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");

        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");
        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");
        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");
        mImageUrls.add("https://cdn.wccftech.com/wp-content/uploads/2018/01/Android-Logo.jpg");
        mNames.add("ASD");


        mImageUrls.add("https://ahotcupofjoe.net/wp-content/uploads/2017/02/android-apps.jpg");
        mNames.add("ASDF");
        initRecyclerView();

    }

    public void initRecyclerView() {
        Log.i(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
