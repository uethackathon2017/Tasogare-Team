package com.tasogare.cookaholic.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tasogare.cookaholic.R;
import com.tasogare.cookaholic.activities.FoodDetailActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListFoodsAdapter extends RecyclerView.Adapter<ListFoodsAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mList;

    public ListFoodsAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_foods_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titleText.setText("Bánh xèo");
        Picasso.with(mContext)
                .load("http://toinayangi.vn/wp-content/uploads/2015/06/m%C3%B3n-%C4%83n-vi%E1%BB%87t-nam-n%E1%BB%95i-ti%E1%BA%BFng-b%C3%BAn-b%C3%B2-hu%E1%BA%BF.jpg")
                .into(holder.mainImage);
        holder.costText.setText("20.000VND");
        holder.foodLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, FoodDetailActivity.class);
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
//        return mList.size();
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title_text) TextView titleText;
        @BindView(R.id.main_image) ImageView mainImage;
        @BindView(R.id.cost_text) TextView costText;
        @BindView(R.id.food_layout) View foodLayout;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
