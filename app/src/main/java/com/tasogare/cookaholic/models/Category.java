package com.tasogare.cookaholic.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

@Table(database = AppDatabase.class, name = "categories")
public class Category {
    @PrimaryKey
    int id;

    @Column
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
