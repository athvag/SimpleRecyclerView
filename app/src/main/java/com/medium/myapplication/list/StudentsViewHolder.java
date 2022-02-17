package com.medium.myapplication.list;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medium.myapplication.R;

import java.util.List;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    TextView studentName,studentClass,studentBirthDate;

    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);

        studentName = itemView.findViewById(R.id.item_students_name);
        studentClass = itemView.findViewById(R.id.item_students_class);
        studentBirthDate = itemView.findViewById(R.id.item_students_birth);

    }

    public void bind(String name,String studentCl,String date){
        studentName.setText(name);
        studentClass.setText(studentCl);
        studentBirthDate.setText("Date of Birth: " + date);
    }

}
