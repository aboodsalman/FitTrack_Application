package com.example.fittrack;

import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StopWatch extends AppCompatActivity {
    private int seconds = 0;
    public static int currentTime;
    public static double overallTime=0;
    public static Exercise currentExercise;
    private boolean running = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);


        checkInstance(savedInstanceState);
        seconds=currentTime;

        runTimer();
    }

    private void checkInstance(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("SECONDS");
            running = savedInstanceState.getBoolean("RUNNING");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("SECONDS", seconds);
        outState.putBoolean("RUNNING", running);


    }

    private void runTimer(){
        final TextView txtTime = findViewById(R.id.txtTime);
        TextView txtName = findViewById(R.id.txtName);
        txtName.setText(currentExercise.getName());
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600) / 60;
                int secs = seconds%60;
                String time = hours +" : " + minutes + " : " + secs;
                txtTime.setText(time);
                if(running){
                    overallTime++;
                    seconds--;
                }
                if(seconds==0){
                    if(running) Toast.makeText(StopWatch.this, "Your Exercise Ends", Toast.LENGTH_SHORT).show();
                    running=false;
                }
                handler.postDelayed(this, 1000);

            }
        });
    }


    public void btnStartOnClick(View view) {
        if(seconds!=0) running = true;
    }

    public void btnStopOnClick(View view) {
        running = false;
    }

    public void btnResetOnClick(View view) {
        running = false;
        seconds = currentTime;
    }
}