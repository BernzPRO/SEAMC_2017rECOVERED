package com.seamc2017.brian.seamc_2017recovered.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.seamc2017.brian.seamc_2017recovered.R;

/**
 * Created by brian on 2017-02-26.
 */

public class seamcstaff extends AppCompatActivity{
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stafflay);

        myImageButton = (ImageButton) findViewById(R.id.imageButton17);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcstaff.this,schedule_listview.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton18);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcstaff.this,day2_staff.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton19);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcstaff.this,day3_listview.class);
                startActivity(intentLoadActivity);
            }
        });

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //Write your logic here
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

