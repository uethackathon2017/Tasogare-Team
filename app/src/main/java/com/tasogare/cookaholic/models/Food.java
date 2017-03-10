package com.tasogare.cookaholic.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = AppDatabase.class, name = "foods")
public class Food extends BaseModel {
    @PrimaryKey
    int id;

    @Column
    String material;

    @Column
    String kcal;

    @Column
    String cooking;

    @Column
    String time_to_cook;

    @Column
    String image;

    @Column
    String description;

    public int getId() {
        return id;
    }

    public String getMaterial() {
        return material;
    }

    public String getKcal() {
        return kcal;
    }

    public String getCooking() {
        return cooking;
    }

    public String getTime_to_cook() {
        return time_to_cook;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
