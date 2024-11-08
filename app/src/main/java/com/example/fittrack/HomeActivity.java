package com.example.fittrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {

    private TextView txtQuote, calories, overallTime;
    private Button btnRecommendation, btnWorkouts;
    public static ListsMockup data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        data=new ListsMockup();
        btnWorkouts=findViewById(R.id.btnWorkouts);
        calories=findViewById(R.id.calories);
        overallTime=findViewById(R.id.overallTime);
        btnRecommendation=findViewById(R.id.recommend);

        btnRecommendation.setOnClickListener(e->{
            Intent intent = new Intent(HomeActivity.this, RecommendationActivity.class);
            startActivity(intent);
            finish();
        });
        int timeSpent=(int)StopWatch.overallTime/60;
        overallTime.setText((int)timeSpent+"");
        calories.setText(timeSpent*8+"");

        txtQuote=findViewById(R.id.txtQuote);
        btnWorkouts.setOnClickListener(e->{
            Intent intent = new Intent(HomeActivity.this, workouts.class);
            startActivity(intent);
            finish();
        });
        Calendar calendar = Calendar.getInstance();
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        txtQuote.setText(ListsMockup.getQuotes().get(dayOfMonth%7));
    }
    @Override
    protected void onResume() {
        super.onResume();

        int timeSpent=(int)StopWatch.overallTime/60;
        if(timeSpent==1){
            overallTime.setText((int)timeSpent+" min");
            calories.setText(timeSpent*8+" cal");
        }
        else {
            overallTime.setText((int) timeSpent + " mins");
            calories.setText(timeSpent * 8 + " cals");
        }
    }
}