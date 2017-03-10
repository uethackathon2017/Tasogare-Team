package com.tasogare.cookaholic.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.List;

@Table(database = AppDatabase.class, name = "categories")
public class Category extends BaseModel{
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

    public static List<Category> getAll(){
        return SQLite.select()
                .from(Category.class)
                .queryList();
    }
}
