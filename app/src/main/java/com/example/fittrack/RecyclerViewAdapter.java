package com.example.fittrack;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Plan> plans;

    public RecyclerViewAdapter(Context context, ArrayList<Plan> plans) {
        this.context = context;
        this.plans = plans;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_view, parent, false); // Ensure you're using an item layout here
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        Plan currentPlan = plans.get(position);
        holder.txtName.setText(currentPlan.getName());
        holder.txtDuration.setText(currentPlan.getDuration()+" minutes"); // Adjust as needed
        holder.img.setImageResource(currentPlan.getImgID());

        holder.btn.setOnClickListener(e -> {
            ExercisesActivity.plan=currentPlan;
            Intent intent = new Intent(holder.itemView.getContext(), ExercisesActivity.class);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return plans.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtName, txtDuration;
        Button btn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            txtName = itemView.findViewById(R.id.txtName);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            btn = itemView.findViewById(R.id.btn);
        }
    }
}
