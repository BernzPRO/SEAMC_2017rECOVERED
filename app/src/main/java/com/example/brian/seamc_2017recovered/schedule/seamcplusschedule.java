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

public class seamcplusschedule extends AppCompatActivity{
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semcplulay);

        myImageButton = (ImageButton) findViewById(R.id.imageButton24);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcplusschedule.this,schedule_listview.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton25);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcplusschedule.this,day2_seamc_plus.class);
                startActivity(intentLoadActivity);


            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton26);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(seamcplusschedule.this,day3_listview.class);
                startActivity(intentLoadActivity);
            }
        });


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

