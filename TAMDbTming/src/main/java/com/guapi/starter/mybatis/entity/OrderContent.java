package com.guapi.starter.mybatis.entity;

import java.util.Date;

public class OrderContent {
    private Integer id;

    private String province;

    private String city;

    private Boolean flag;

    private String temp;

    private String temp1;

    private Date rqMake;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
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
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", flag=").append(flag);
        sb.append(", temp=").append(temp);
        sb.append(", temp1=").append(temp1);
        sb.append(", rqMake=").append(rqMake);
        sb.append("]");
        return sb.toString();
    }
}