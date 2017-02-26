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

public class schedule_listview extends Activity {
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
        mScheduleList.add(new schedulelis(1, "Teams Arrive", "Before 2 pm", "Airport"));
        mScheduleList.add(new schedulelis(2, "Arrival at hotel and check in", "2 pm", "Hotel Atria"));
        mScheduleList.add(new schedulelis(3, "Dinner (not provided)", "16.00-18.00", "Nearby mall (eateries may be suggested)"));
        mScheduleList.add(new schedulelis(4, "Opening Event - Icebreaker and Introductory Games", "18.30-21.00", "Hotel Atria - Grand Ballroom"));
        mScheduleList.add(new schedulelis(5, "Work on Long Term Questions + Bed Time", "21.00-", "Hotel Atria"));


        //Init adapter
        adapter = new schedule_adapter(getApplicationContext(), mScheduleList);
        lvSchedule.setAdapter(adapter);

    }
}

