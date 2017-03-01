package com.seamc2017.brian.seamc_2017recovered.contact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import com.seamc2017.brian.seamc_2017recovered.R;
import com.seamc2017.brian.seamc_2017recovered.emergency.emergencylis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class contact_listview extends Activity {
    private ListView lvContact;
    private contact_adapter adapter;
    private List<contactlis> mContactList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_lis);

        lvContact = (ListView)findViewById(R.id.listview_contact);

        mContactList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mContactList.add(new contactlis(1, "Mrs Shah", "Teacher In Charge", "0859 3952 5738","simi_shah@bsj.sch.id"));
        mContactList.add(new contactlis(2, "Seong Bin Cho", "App Programmer", "0812 8694 8291","18chos@bsj.sch.id"));
        mContactList.add(new contactlis(3, "Jessica Hadiwijoyo", "Co-programmer", "0812 1277 0624", "18hadiwijoyoj@bsj.sch.id"));
        mContactList.add(new contactlis(4, "Atria Hotel", "Hotel", "(021) 29215999","reservation@atriahotelserpong.com"));
        mContactList.add(new contactlis(5, "British School Jakarta", "School", "021 745 1670", "principal@bsj.sch.id"));
        mContactList.add(new contactlis(6, "Simon Dennis", "Principal", "0812 9042 5506", "simon_dennis@bsj.sch.id"));
        mContactList.add(new contactlis(7, "Shane Nathan", "Head of Primary", "0816 806 824", "shane_nathan@bsj.sch.id"));
        mContactList.add(new contactlis(8, "Rachel Edwards", "Head of Secondary", "0815 8470 3309","rachel_edwards@bsj.sch.id" ));
        mContactList.add(new contactlis(9, "Dr Marianti", "Health Advisor", "0811 1727 772", "marianti@bsj.sch.id"));
        mContactList.add(new contactlis(10, "Yusuf Fadhil", "Safety Officer", "0895 3030 8886", "yusuf_fadhil@bsj.sch.id"));
        mContactList.add(new contactlis(11, "Jennifer Simmons", "Marketing and Communications", "0855 1092 211", "jennifer_simmons@bsj.sch.id"));
        mContactList.add(new contactlis(12, "Gary Lovett", "Campus Manager", "0811 8008 449", "gary_lovett@bsj.sch.id"));
        mContactList.add(new contactlis(13, "Sonny Engolode", "Security & Event Management", "0812 1010 009", "sonny@bsj.sch.id"));

        //Init adapter
        adapter = new contact_adapter(getApplicationContext(), mContactList);
        lvContact.setAdapter(adapter);



    }



}

