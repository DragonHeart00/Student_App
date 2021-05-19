package com.example.student_app.Controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_app.Model.Student;
import com.example.student_app.R;
import com.example.student_app.View.AccountActivity;

import java.util.ArrayList;
import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.MyViewHolder> {

    private List<Student> students;
    private Context mContext;

    public StudentListAdapter(List<Student> students, Context mContext) {
        this.students = students;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public StudentListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent,false);
        return new StudentListAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.MyViewHolder holder, int position) {
        Student student = students.get(position);

        holder.textName.setText(student.getFirstName() + " " +student.getLastName());
        holder.textStudentId.setText(student.getIdNumber() + "");
        holder.textEmail.setText(student.getEmail());
        holder.textPhoneNumber.setText(student.getPhoneNumber() + "");
        holder.textStartAt.setText(student.getStartAt() + "");
        holder.textEndAt.setText(student.getEndAt()+ "");
        holder.textAge.setText(student.getAge() + "");


        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(mContext, AccountActivity.class);
                profileIntent.putExtra("student_id", student.getIdNumber()+"");
                profileIntent.putExtra("student_firstName", student.getFirstName());
                profileIntent.putExtra("student_lastName", student.getLastName());
                profileIntent.putExtra("student_Email", student.getEmail());
                profileIntent.putExtra("student_PhoneNumber", student.getPhoneNumber() +"");
                profileIntent.putExtra("student_StartAt", student.getStartAt());
                profileIntent.putExtra("student_EndAt", student.getEndAt());
                profileIntent.putExtra("student_Age", student.getAge()+"");
                mContext.startActivity(profileIntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textName, textStudentId, textEmail, textPhoneNumber, textStartAt, textEndAt, textAge;
        private View mView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            textName = itemView.findViewById(R.id.student_name);
            textStudentId = itemView.findViewById(R.id.idNumber);
            textEmail = itemView.findViewById(R.id.studentEmail);
            textPhoneNumber = itemView.findViewById(R.id.studentPhoneNumber);
            textStartAt = itemView.findViewById(R.id.studentStartAt);
            textEndAt = itemView.findViewById(R.id.studentEndAt);
            textAge = itemView.findViewById(R.id.studentAge);

        }
    }
}
