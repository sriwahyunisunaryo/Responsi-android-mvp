package com.responsi.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;

import com.responsi.mvp.model.ResultsItem;
import com.responsi.mvp.presenter.PeoplePresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecData;
    LinearLayoutManager mLayoutManager;
    SnapHelper mSnapHelper;
    PeoplePresenterImpl peoplePresenterImpl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecData = findViewById(R.id.rvData);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        mRecData.setLayoutManager(mLayoutManager);

        init();

    }

    private void init() {
        peoplePresenterImpl = new PeoplePresenterImpl(this);
        peoplePresenterImpl.callPeopleData("10","en");
    }



    @Override
    public void setPeopleData(List<ResultsItem> resultsItems) {
        Log.i("xxxx" , "set Data" + resultsItems);
    }
}

