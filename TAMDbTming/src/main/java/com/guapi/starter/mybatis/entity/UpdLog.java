package com.guapi.starter.mybatis.entity;

import java.util.Date;

public class UpdLog {
    private Integer id;

    private Integer dataSource;

    private Integer num;

    private Date rqStart;

    private Date rqEnd;

    private Integer mqFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getRqStart() {
        return rqStart;
    }

    public void setRqStart(Date rqStart) {
        this.rqStart = rqStart;
    }

    public Date getRqEnd() {
        return rqEnd;
    }

    public void setRqEnd(Date rqEnd) {
        this.rqEnd = rqEnd;
    }

    public Integer getMqFlag() {
        return mqFlag;
    }

    public void setMqFlag(Integer mqFlag) {
        this.mqFlag = mqFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", num=").append(num);
        sb.append(", rqStart=").append(rqStart);
        sb.append(", rqEnd=").append(rqEnd);
        sb.append(", mqFlag=").append(mqFlag);
        sb.append("]");
        return sb.toString();
    }
}