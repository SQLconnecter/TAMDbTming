package com.guapi.starter.mybatis.entity;

import java.util.Date;

public class DataSource {
    private Integer id;

    private String name;

    private String url;

    private Boolean flag;

    private Integer grade;

    private String temp;

    private String temp1;

    private String temp2;

    private Date rqMake;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public Date getRqMake() {
        return rqMake;
    }

    public void setRqMake(Date rqMake) {
        this.rqMake = rqMake;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", flag=").append(flag);
        sb.append(", grade=").append(grade);
        sb.append(", temp=").append(temp);
        sb.append(", temp1=").append(temp1);
        sb.append(", temp2=").append(temp2);
        sb.append(", rqMake=").append(rqMake);
        sb.append("]");
        return sb.toString();
    }
}