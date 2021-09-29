package com.app.legaciestask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.app.legaciestask.R;
import com.app.legaciestask.databinding.EventRowBinding;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.eventViewHolder> {

    private LayoutInflater layoutInflater;

    @NonNull
    @Override
    public eventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        EventRowBinding binding;
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.event_row,parent,false);

        return new EventAdapter.eventViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull eventViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class eventViewHolder extends RecyclerView.ViewHolder {
        EventRowBinding binding;
        public eventViewHolder(@NonNull EventRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
