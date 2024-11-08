package com.example.fittrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class RecommendationActivity extends AppCompatActivity {
    private Button btnResult;
    private EditText ageEdit, weightEdit, heightEdit;
    private RadioButton male, female;
    private TextView txtRecom, txtFood;
    private ListView lstView, lstFood;
    private ArrayList<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recommendation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnResult=findViewById(R.id.btnResult);
        ageEdit=findViewById(R.id.ageEdit);
        weightEdit=findViewById(R.id.weightEdit);
        heightEdit=findViewById(R.id.heightEdit);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        txtRecom=findViewById(R.id.txtRecom);
        lstView=findViewById(R.id.lstView);
        lstFood=findViewById(R.id.lstFood);
        txtFood=findViewById(R.id.txtFood);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = arr.get(i);
                ExercisesActivity.plan=ListsMockup.getPlanByName(item);
                Intent intent = new Intent(RecommendationActivity.this, ExercisesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnResult.setOnClickListener(e->{
            if(weightEdit.getText().toString().isBlank()){
                Toast.makeText(this, "Please enter the weight", Toast.LENGTH_SHORT).show();
            }
            else if(heightEdit.getText().toString().isBlank()){
                Toast.makeText(this, "Please enter the height", Toast.LENGTH_SHORT).show();
            }
            else if(ageEdit.getText().toString().isBlank()){
                Toast.makeText(this, "Please enter the age", Toast.LENGTH_SHORT).show();
            }
            else if(!male.isChecked() && !female.isChecked()){
                Toast.makeText(this, "Please choose the gender", Toast.LENGTH_SHORT).show();
            }
            else{
                double BMI = Double.parseDouble(weightEdit.getText().toString())/(Double.parseDouble(heightEdit.getText().toString())
                        *Double.parseDouble(heightEdit.getText().toString()));
                txtRecom.setText("Your BMI is almost "+Math.ceil(BMI)+", recommended workouts:");
                txtFood.setText("Recommended types of food:");
                if(BMI<18.5){
                    fillListView("BMI < 18.5");
                } else if(BMI>=18.5 && BMI<25) {
                    fillListView("BMI 18.5 - 24.9");
                } else if(BMI>=25 && BMI<30){
                    fillListView("BMI 25 - 29.9");
                } else if(BMI>=30 && BMI<35){
                    fillListView("BMI 30 - 34.9");
                } else{
                    fillListView("BMI 35 and above");
                }
            }
        });
    }
    private void fillListView(String type){
        arr=ListsMockup.getRecomByType(type).getWorkouts();
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.textView, arr);
        lstView.setAdapter(listAdapter);
        ArrayAdapter<String> listAdapter2 = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.textView, ListsMockup.getRecomByType(type).getFoods());
        lstFood.setAdapter(listAdapter2);
        listAdapter.notifyDataSetChanged();
    }
}