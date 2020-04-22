package com.guapi.starter.mybatis.entity;

import java.util.Date;

public class TzInform {
    private Integer id;

    private String articleId;

    private String batch;

    private String city;

    private String province;

    private Integer send;

    private Date rqMake;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
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
        sb.append(", articleId=").append(articleId);
        sb.append(", batch=").append(batch);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", send=").append(send);
        sb.append(", rqMake=").append(rqMake);
        sb.append("]");
        return sb.toString();
    }
}