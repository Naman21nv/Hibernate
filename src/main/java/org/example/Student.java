package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id //this acts as primary key
    private int sid;
    private String sname;

    int getSid(){
        return sid;
    }
     String getSname(){
        return sname;
    }
     void setSid(int sid){

        this.sid=sid;
    }
    void setSname(String sname){
        this.sname=sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
