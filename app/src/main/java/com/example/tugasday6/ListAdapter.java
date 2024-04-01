package com.example.tugasday6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private ArrayList<ListModel> listModels;

    public ListAdapter(MainActivity mainActivity, ArrayList<ListModel> listModels) {
        this.listModels = listModels;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.list1.setText(listModels.get(position).getNamaItem());
        holder.gmb1.setImageResource(listModels.get(position).getGmbItem());

    }

    @Override
    public int getItemCount() {
        return listModels.size();
    }

    public interface OnItemClickListener{
        void onItemClick(ListModel listAdapter);
    }

    private OnItemClickListener listener;

    public void setOnClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView list1;
        ImageView gmb1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            list1 = itemView.findViewById(R.id.list1);
            gmb1 = itemView.findViewById(R.id.gmb1);
            itemView.setOnClickListener(this);

        }

        public void onClick(View v){
            if (listener != null){
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    listener.onItemClick(listModels.get(position));
                }
            }
        }
    }
}
