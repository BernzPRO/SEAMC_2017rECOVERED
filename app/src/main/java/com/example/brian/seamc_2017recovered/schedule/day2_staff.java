package com.example.brian.seamc_2017recovered.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.brian.seamc_2017recovered.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class day2_staff extends Activity {
    private ListView lvSchedule;
    private schedule_adapter adapter;
    private List<schedulelis> mScheduleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_lis);

        lvSchedule = (ListView)findViewById(R.id.listview_schedule);

        mScheduleList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mScheduleList.add(new schedulelis(1, "Breakfast at hotel", "06.00 onwards", "Mezzanine Restaurant"));
        mScheduleList.add(new schedulelis(2, "Bus from Hotel Atria to BSJ", "08.00-08.45", "-"));
        mScheduleList.add(new schedulelis(3, "Marcy Robertson", "09.00-10.00", "Library"));
        mScheduleList.add(new schedulelis(4, "Katie Steckles", "11.00-12.00", "Library"));
        mScheduleList.add(new schedulelis(5, "Lunch", "13.00-14.00", "Canteen"));
        mScheduleList.add(new schedulelis(6, "Dinner at BSJ", "17.45-19.45", "BSJ Campus"));
        mScheduleList.add(new schedulelis(7, "Buses depart to Hotel Atria", "19.45", "-"));
        mScheduleList.add(new schedulelis(8, "Return to hotel", "20.30", "Hotel Atria"));



        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}

