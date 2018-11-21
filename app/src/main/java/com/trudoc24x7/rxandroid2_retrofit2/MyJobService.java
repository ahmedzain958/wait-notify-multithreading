package com.trudoc24x7.rxandroid2_retrofit2;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d("trudocjobonStartJob", params.toString());
        Log.d("trudocjobonStartJob", String.valueOf(System.currentTimeMillis() / (1000 * 60 * 60)) + " hour");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d("trudocjobonStopJob", String.valueOf(System.currentTimeMillis() / (1000 * 60 * 60)) + " hour");
        return false;
    }
}
