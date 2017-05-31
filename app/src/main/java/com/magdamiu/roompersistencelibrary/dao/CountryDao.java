package com.magdamiu.roompersistencelibrary.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.magdamiu.roompersistencelibrary.entity.Country;

import java.util.List;

/**
 * Created by magdamiu on 30/05/17.
 */

@Dao
public interface CountryDao {

    @Query("SELECT * FROM Country")
    List<Country> getAll();

    @Query("SELECT * FROM Country where name LIKE  :name")
    Country findByName(String name);

    @Query("SELECT COUNT(*) from Country")
    int countCountries();

    @Insert
    void insertAll(Country... countries);

    @Delete
    void delete(Country country);
}
