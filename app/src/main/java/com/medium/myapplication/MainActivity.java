package com.medium.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Toast;

import com.medium.myapplication.list.ItemClickCallback;
import com.medium.myapplication.list.StudentsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickCallback {

     private List<Student> students = new ArrayList<>();
     private RecyclerView recyclerView;
     private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recyclerView);
        createList();
    }

    private void createList() {

        for(int i=1;i<10;i++){
            Student student = new Student("Student No: "+ i,"20/05/199"+i,"Grade "+i);
            students.add(student);
        }

        StudentsAdapter studentsAdapter = new StudentsAdapter(students,this);
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(studentsAdapter);
    }

    @Override
    public void onItemClicked(View view, String studentName, String studentClass, String studentBirth) {
        Toast.makeText(this, "Clicked student with: " +studentName +" " + studentClass +" "+ studentBirth, Toast.LENGTH_SHORT).show();
    }
}