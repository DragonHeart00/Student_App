package com.example.student_app.View;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.student_app.Controller.StudentListAdapter;
import com.example.student_app.Model.Student;
import com.example.student_app.R;

import java.util.ArrayList;
import java.util.List;

public class StudentListFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Student> studentList;
    private StudentListAdapter studentListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_list, container, false);

        recyclerView = view.findViewById(R.id.all_users_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        studentList = new ArrayList<>();



        // todo add mysql
        Student student1 = new Student("Sulaiman","Kasas","Sulaiman96“outlook.dk","2019","2023",2019312,42321721,25);
        studentList.add(student1);

        Student student2 = new Student("Peter","Kris","peter123“outlook.dk","2013","2020",2013122,32421232,19);
        studentList.add(student2);

        Student student3 = new Student("Sarah","Lund","Sarah23“outlook.dk","2020","2024",2020124,54321234,23);
        studentList.add(student3);


        studentListAdapter = new StudentListAdapter(studentList, getContext());
        recyclerView.setAdapter(studentListAdapter);
        studentListAdapter.notifyDataSetChanged();

        return view;
    }




}