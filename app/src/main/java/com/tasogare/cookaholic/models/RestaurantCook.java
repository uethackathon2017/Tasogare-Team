package com.tasogare.cookaholic.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = AppDatabase.class, name = "restaurant_cook")
public class RestaurantCook extends BaseModel {
    @PrimaryKey
    int id;

    @Column(name = "foood_id")
    int foodId;

    @Column(name = "categori_id")
    int categoryId;

    public int getId() {
        return id;
    }

    public int getFoodId() {
        return foodId;
    }

    public int getCategoryId() {
        return categoryId;
    }
}
