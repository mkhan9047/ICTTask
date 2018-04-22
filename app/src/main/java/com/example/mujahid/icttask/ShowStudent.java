package com.example.mujahid.icttask;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShowStudent extends AppCompatActivity {
RecyclerView recyclerView;
List<Student> students;
CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_student);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        students = new ArrayList<>();
        students = getLocation(this);
        customAdapter = new CustomAdapter(students);
        recyclerView.setAdapter(customAdapter);


    }

    public static List<Student> getLocation(Context context) {
        SQLiteOpenHelper helper = new DatabaseHelper(context);
        SQLiteDatabase database = helper.getReadableDatabase();
        Cursor cursor = null;
        final List<Student> pjo = new ArrayList<>();
        String sqlQueary = "Select * from student";
        cursor = database.rawQuery(sqlQueary, null);
        while (cursor.moveToNext()) {
            Student locationPojo = new Student(cursor.getString(0), cursor.getString(1), cursor.getString(2),cursor.getString(3),cursor.getString(4));
            pjo.add(locationPojo);

        }
        database.close();
        cursor.close();

        return pjo;
    }
}
