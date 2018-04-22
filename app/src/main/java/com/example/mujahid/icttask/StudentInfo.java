package com.example.mujahid.icttask;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class StudentInfo extends AppCompatActivity {

    EditText name, institute, email, phone;
    RadioGroup group;
Button saveData;
RadioButton female , male;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        name = findViewById(R.id.name);
        institute = findViewById(R.id.instituteName);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        group = findViewById(R.id.radioGroup);
saveData = findViewById(R.id.saveData);



saveData.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("name",name.getText().toString());
        contentValues.put("institute", institute.getText().toString());
        contentValues.put("phone",phone.getText().toString());
        contentValues.put("email",email.getText().toString());
        int selectedId=group.getCheckedRadioButtonId();
        if(selectedId==R.id.female){
            contentValues.put("gender","female");
             String female = "Female";
            Log.d("test", female);
        }else if(selectedId==R.id.male){
            contentValues.put("gender","male");
        }


        SQLiteOpenHelper helper = new DatabaseHelper(StudentInfo.this);
        SQLiteDatabase database = helper.getWritableDatabase();
        database.insert("student",null,contentValues);
        Log.d("success","yes");
    }
});

    }
}
