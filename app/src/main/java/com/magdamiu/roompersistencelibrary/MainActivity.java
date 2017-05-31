package com.magdamiu.roompersistencelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.magdamiu.roompersistencelibrary.database.AppDatabase;
import com.magdamiu.roompersistencelibrary.utils.DatabaseInitializer;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        AppDatabase.destroyInstance();
        super.onDestroy();
    }

    public void btnSaveData_onClick(View view){
        DatabaseInitializer.populateAsync(AppDatabase.getAppDatabase(this));
    }
}
