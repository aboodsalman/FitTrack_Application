package com.example.fittrack;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Exercise> exercises;

    public ExercisesAdapter(Context context, ArrayList<Exercise> exercises) {
        this.context = context;
        this.exercises = exercises;
    }

    @NonNull
    @Override
    public ExercisesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.exercise_card_view, parent, false); // Ensure you're using an item layout here
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExercisesAdapter.MyViewHolder holder, int position) {
        Exercise currentExercise = exercises.get(position);
        holder.txtName.setText(currentExercise.getName());
        holder.txtDuration.setText(currentExercise.getDuration());
        holder.btnStart.setOnClickListener(e->{
            StopWatch.currentExercise=currentExercise;
            String time[]=currentExercise.getDuration().split(" ");
            StopWatch.currentTime=Integer.parseInt(time[0]);
            if(time[1].contains("min")){
                StopWatch.currentTime*=60;
            }
            Intent intent = new Intent(holder.itemView.getContext(), StopWatch.class);
            holder.itemView.getContext().startActivity(intent);
        });
        holder.btnVideo.setOnClickListener(e->{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentExercise.getUrl()));
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtDuration;
        Button btnStart, btnVideo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            btnStart = itemView.findViewById(R.id.btnStart);
            btnVideo = itemView.findViewById(R.id.btnVideo);
        }
    }
}
