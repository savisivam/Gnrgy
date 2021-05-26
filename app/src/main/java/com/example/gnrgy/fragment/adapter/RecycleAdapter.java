package com.example.gnrgy.fragment.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gnrgy.R;
import com.example.gnrgy.fragment.SecondFragment;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private String[] dataSource;
    Context context;
    String editText;
    public RecycleAdapter(Context context,String[] dataSource,String editText){
        this.dataSource = dataSource;
        this.context=context;
        this.editText=editText;
    }

    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.string_list, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.ViewHolder holder, int position) {
        holder.textView.setText(dataSource[position]);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment fragmentB=new SecondFragment();
                Bundle bundle=new Bundle();
                bundle.putString("name",editText);
                fragmentB.setArguments(bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);


        }
    }
}

