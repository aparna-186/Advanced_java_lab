package com.srkr;

public class Student {

    private int sid;
    private String name;
    private String branch;

    public Student() {
    }

    public Student(int sid, String name, String branch) {
        this.sid = sid;
        this.name = name;
        this.branch = branch;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
