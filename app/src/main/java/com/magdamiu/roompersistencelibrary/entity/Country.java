package com.magdamiu.roompersistencelibrary.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by magdamiu on 30/05/17.
 */

@Entity(tableName = "Country")
public class Country {

    @PrimaryKey(autoGenerate = true)
    private int countryId;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "town")
    private String town;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
