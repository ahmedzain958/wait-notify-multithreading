package com.trudoc24x7.rxandroid2_retrofit2;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class JobSchedulerActivity extends AppCompatActivity {
    long rootRandom = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_scheduler);
       /* Random r = new Random();

        class RandomThread extends Thread {
            long seed;

            RandomThread(long seed) {
                this.seed = seed;
            }

            @Override
            public void run() {
                super.run();
                Random seedRandom = new Random(1000);
               *//* rootRandom = seedRandom.nextInt();
                Log.d("Randomtag", rootRandom + "");*//*
                Log.d("seedRandom.nextInt()", seedRandom.nextInt() + "");
            }
        }

        RandomThread randomThread = new RandomThread(10);
        randomThread.run();

        */
        final Handler handler = new Handler();
        int delay = 3000;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("ssss", "zain");
            }
        }, delay);

    }


}
