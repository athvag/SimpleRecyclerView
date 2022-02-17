package com.medium.myapplication.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.medium.myapplication.R;
import com.medium.myapplication.Student;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {

    private List<Student> student;

    public StudentsAdapter(List<Student> student) {
        this.student = student;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_students, parent, false);
        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        holder.bind(student.get(position).getStudentName(),student.get(position).getStudentClass(),student.get(position).getStudentBirthDate());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }
}
