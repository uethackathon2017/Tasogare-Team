package com.tasogare.cookaholic.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tasogare.cookaholic.R;
import com.tasogare.cookaholic.adapters.ListFoodsAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListFoodsActivity extends AppCompatActivity {
    @BindView(R.id.list_foods) RecyclerView mListFoods;

    private ArrayList<String> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_foods);
        ButterKnife.bind(this);

        initialViews();
    }

    private void initialViews() {
        ListFoodsAdapter adapter = new ListFoodsAdapter(this, mData);
        mListFoods.setLayoutManager(new GridLayoutManager(this, 2,
                LinearLayoutManager.VERTICAL, false));
        mListFoods.setAdapter(adapter);
    }
}
