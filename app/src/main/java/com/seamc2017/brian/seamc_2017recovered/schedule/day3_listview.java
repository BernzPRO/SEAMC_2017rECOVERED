package com.seamc2017.brian.seamc_2017recovered.schedule;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import com.seamc2017.brian.seamc_2017recovered.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class day3_listview extends Activity {
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
        mScheduleList.add(new schedulelis(1, "Breakfast at hotel", "06.00-07.45", "Mezzanine Restaurant"));
        mScheduleList.add(new schedulelis(2, "Bus from Hotel Atria to BSJ", "07.45-08.30", "-"));
        mScheduleList.add(new schedulelis(3, "Codebreaker", "08.30-10.00", "Various classrooms"));
        mScheduleList.add(new schedulelis(4, "Long Term Questions and Break", "10.00-10.45", "-"));
        mScheduleList.add(new schedulelis(5, "Team Round", "10.45-12.00", "Sports Hall"));
        mScheduleList.add(new schedulelis(6, "Lunch + Submission of Long Term questions by 13:00", "12.00-13.00", "Canteen"));
        mScheduleList.add(new schedulelis(7, "Energiser Round", "13.00-14.15", "Sports Hall"));
        mScheduleList.add(new schedulelis(8, "Activity Round A or B or Maths trail", "14.15 – 15.45", "Sports Hall/BSJ Campus"));
        mScheduleList.add(new schedulelis(9, "Buses depart to Hotel Atria", "16.00", "Outside Raffles"));
        mScheduleList.add(new schedulelis(10, "Prepare for Gala Dinner", "17.00", "Hotel Atria"));
        mScheduleList.add(new schedulelis(11, "Buses depart for Summarecon", "18.30", "Outside reception"));
        mScheduleList.add(new schedulelis(12, "Gala Dinner and prize giving", "19.00-22.00", "Summarecon"));
        mScheduleList.add(new schedulelis(13, "Buses depart to Hotel Atria", "22.00", "Outside reception"));












        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}

