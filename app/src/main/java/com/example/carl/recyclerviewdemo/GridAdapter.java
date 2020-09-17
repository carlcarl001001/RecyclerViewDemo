package com.example.carl.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private Context context;
    public GridAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public GridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_grid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.GridViewHolder holder, final int position) {
        holder.tv.setText("Hello world");

        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"click..."+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 40;
    }

    class GridViewHolder extends RecyclerView.ViewHolder{

        private TextView tv;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.textView3);
        }
    }
}