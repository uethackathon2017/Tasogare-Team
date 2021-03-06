package com.tasogare.cookaholic.models;


import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = AppDatabase.class, name = "categori_cook")
public class CategoryCook extends BaseModel {
    @PrimaryKey
    int id;

    @Column(name = "food_id")
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
