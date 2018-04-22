package com.example.mujahid.icttask;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mujahid on 4/21/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
   private List<Student> list = new ArrayList<>();

    public CustomAdapter(List<Student> list) {
        this.list = list;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_student, parent, false);
        return new CustomAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
    holder.name.setText(list.get(position).getName());
    holder.institute.setText(list.get(position).getInstitute());
    holder.phone.setText(list.get(position).getPhone());
    holder.email.setText(list.get(position).getEmail());
    holder.gender.setText(list.get(position).getGender());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, email, phone, institute, gender;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.getName);
            email = itemView.findViewById(R.id.getEmail);
            phone = itemView.findViewById(R.id.getPhone);
            institute = itemView.findViewById(R.id.getInstitute);
            gender = itemView.findViewById(R.id.getGender);
        }
    }
}
