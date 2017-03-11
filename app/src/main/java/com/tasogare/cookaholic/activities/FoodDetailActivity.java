package com.tasogare.cookaholic.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tasogare.cookaholic.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FoodDetailActivity extends AppCompatActivity {
    @BindView(R.id.main_image) ImageView mImageView;
    @BindView(R.id.title_text) TextView mTitleText;
    @BindView(R.id.description_text) TextView mDescriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        ButterKnife.bind(this);

        initialViews();
    }

    private void initialViews() {
        Picasso.with(this)
                .load("http://toinayangi.vn/wp-content/uploads/2015/06/m%C3%B3n-%C4%83n-vi%E1%BB%87t-nam-n%E1%BB%95i-ti%E1%BA%BFng-b%C3%BAn-b%C3%B2-hu%E1%BA%BF.jpg")
                .into(mImageView);
    }
}
