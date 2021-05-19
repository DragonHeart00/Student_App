package com.example.student_app.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.student_app.Model.Student;
import com.example.student_app.R;

public class AccountActivity extends AppCompatActivity {

    private TextView mFirstName, mIdNumber, mEmail, mPhoneNumber, mStartAt, mEndAt, mAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mFirstName= findViewById(R.id.nameId);
        String firstName = getIntent().getStringExtra("student_firstName");
        String lastName = getIntent().getStringExtra("student_lastName");
        mFirstName.setText(firstName +" "+lastName);

        mIdNumber= findViewById(R.id.idNumberId);
        String id = getIntent().getStringExtra("student_id");
        mIdNumber.setText(id);

        mEmail= findViewById(R.id.emailId);
        String email = getIntent().getStringExtra("student_Email");
        mEmail.setText(email);

        mPhoneNumber= findViewById(R.id.phoneNumberId);
        String phoneNumber = getIntent().getStringExtra("student_PhoneNumber");
        mPhoneNumber.setText(phoneNumber);

        mStartAt= findViewById(R.id.startAtId);
        String startAt = getIntent().getStringExtra("student_StartAt");
        mStartAt.setText(startAt);

        mEndAt= findViewById(R.id.endAtId);
        String endAt = getIntent().getStringExtra("student_EndAt");
        mEndAt.setText(endAt);

        mAge= findViewById(R.id.ageId);
        String age = getIntent().getStringExtra("student_Age");
        mAge.setText(age);
    }
}