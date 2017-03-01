package com.seamc2017.brian.seamc_2017recovered.contact;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


import com.seamc2017.brian.seamc_2017recovered.R;

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
        mContactList.add(new contactlis(1, "Mrs Shah", "Teacher In Charge", "0812 xxxx xxxx","simi_shah@bsj.sch.id"));
        mContactList.add(new contactlis(2, "Seong Bin Cho", "App Programmer", "0812 8694 8291","18chos@bsj.sch.id"));
        mContactList.add(new contactlis(3, "Jessica Hadiwijoyo", "Co-programmer", "0812 1277 0624", "18hadiwijoyoj@bsj.sch.id"));
        mContactList.add(new contactlis(4, "Atria Hotel", "Hotel", "(021) 29215999","-"));

        //Init adapter
        adapter = new contact_adapter(getApplicationContext(), mContactList);
        lvContact.setAdapter(adapter);



    }



}

