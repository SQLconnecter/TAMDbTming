package com.guapi.starter.mybatis.entity;

public class Province {
    private String regncode;

    private String regnnm;

    private String regnfullpinyin;

    private Short regnlvlcd;

    public String getRegncode() {
        return regncode;
    }

    public void setRegncode(String regncode) {
        this.regncode = regncode == null ? null : regncode.trim();
    }

    public String getRegnnm() {
        return regnnm;
    }

    public void setRegnnm(String regnnm) {
        this.regnnm = regnnm == null ? null : regnnm.trim();
    }

    public String getRegnfullpinyin() {
        return regnfullpinyin;
    }

    public void setRegnfullpinyin(String regnfullpinyin) {
        this.regnfullpinyin = regnfullpinyin == null ? null : regnfullpinyin.trim();
    }

    public Short getRegnlvlcd() {
        return regnlvlcd;
    }

    public void setRegnlvlcd(Short regnlvlcd) {
        this.regnlvlcd = regnlvlcd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regncode=").append(regncode);
        sb.append(", regnnm=").append(regnnm);
        sb.append(", regnfullpinyin=").append(regnfullpinyin);
        sb.append(", regnlvlcd=").append(regnlvlcd);
        sb.append("]");
        return sb.toString();
    }
}