package com.itgaoshu.springboot.bean;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="student")
public class Student implements Serializable {



    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer stuid=11111;
    private String stuname;
    private double scose;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public double getScose() {
        return scose;
    }

    public void setScose(double scose) {
        this.scose = scose;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", scose=" + scose +
                '}';
    }
}
