package com.medium.myapplication.list;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medium.myapplication.R;

import java.util.List;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    TextView studentName,studentClass,studentBirthDate;
    private ItemClickCallback callback;

    public StudentsViewHolder(@NonNull View itemView, ItemClickCallback listener) {
        super(itemView);
        this.callback = listener;

        studentName = itemView.findViewById(R.id.item_students_name);
        studentClass = itemView.findViewById(R.id.item_students_class);
        studentBirthDate = itemView.findViewById(R.id.item_students_birth);

    }

    public void bind(String name,String studentCl,String date){
        studentName.setText(name);
        studentClass.setText(studentCl);
        studentBirthDate.setText("Date of Birth: " + date);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onItemClicked(v,name,date,studentCl);
            }
        });
    }

}
