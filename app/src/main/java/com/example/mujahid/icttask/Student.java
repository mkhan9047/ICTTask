package com.example.mujahid.icttask;

/**
 * Created by Mujahid on 4/21/2018.
 */

public class Student {
    private String name;
    private String institute;
    private String phone;
    private String email;
    private String gender;

    public Student(String name, String institute, String phone, String email, String gender) {
        this.name = name;
        this.institute = institute;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getInstitute() {
        return institute;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
