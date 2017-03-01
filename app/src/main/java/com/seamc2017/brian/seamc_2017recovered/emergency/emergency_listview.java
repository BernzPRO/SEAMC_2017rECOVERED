package com.seamc2017.brian.seamc_2017recovered.emergency;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import com.seamc2017.brian.seamc_2017recovered.R;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class emergency_listview extends Activity {
    private ListView lvEmergency;
    private emergency_adapter adapter;
    private List<emergencylis> mEmergencyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_lis);

        lvEmergency = (ListView)findViewById(R.id.listview_emergency);

        mEmergencyList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mEmergencyList.add(new emergencylis(1, "International SOS", "Hospitals", "021 750 6001"));
        mEmergencyList.add(new emergencylis(2, "RS Premier Bintaro", "Hospitals", "021 7455 500 / 600 / 700"));
        mEmergencyList.add(new emergencylis(3, "RS Pondok Indah", "Hospitals","021 765 2565 / 750 2322"));
        mEmergencyList.add(new emergencylis(4, "Siloam Karawaci", "Hospitals","021 546 0055 / 546 0066"));
        mEmergencyList.add(new emergencylis(5, "Medistra Hospital", "Hospitals","021 521 0200"));
        mEmergencyList.add(new emergencylis(6, "Global Assistance & Healthcare", "Hospitals","021 2997 8988"));

        mEmergencyList.add(new emergencylis(7, "Simon Dennis", "Principal", "0812 9042 5506"));
        mEmergencyList.add(new emergencylis(8, "Shane Nathan", "Head of Primary", "0816 806 824"));
        mEmergencyList.add(new emergencylis(9, "Rachel Edwards", "Head of Secondary", "0815 8470 3309"));
        mEmergencyList.add(new emergencylis(10, "Dr Marianti", "Health Advisor", "0811 1727 772"));
        mEmergencyList.add(new emergencylis(11, "Yusuf Fadhil", "Safety Officer", "0895 3030 8886"));
        mEmergencyList.add(new emergencylis(12, "Jennifer Simmons", "Marketing and Communications", "0855 1092 211"));
        mEmergencyList.add(new emergencylis(13, "Gary Lovett", "Campus Manager", "0811 8008 449"));
        mEmergencyList.add(new emergencylis(14, "Sonny Engolode", "Security & Event Management", "0812 1010 009"));






        //Init adapter
        adapter = new emergency_adapter(getApplicationContext(),mEmergencyList);
        lvEmergency.setAdapter(adapter);



    }



}

