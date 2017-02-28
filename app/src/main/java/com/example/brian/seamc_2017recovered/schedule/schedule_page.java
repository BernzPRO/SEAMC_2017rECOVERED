package com.example.brian.seamc_2017recovered.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.brian.seamc_2017recovered.R;

/**
 * Created by brian on 2017-02-26.
 */

public class schedule_page extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_page);

        myImageButton = (ImageButton) findViewById(R.id.imageButton27);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(schedule_page.this,seamcschedule.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton28);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(schedule_page.this,seamcplusschedule.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton29);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(schedule_page.this,seamcstaff.class);
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