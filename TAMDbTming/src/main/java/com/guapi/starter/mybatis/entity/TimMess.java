package com.guapi.starter.mybatis.entity;

import java.util.Date;

public class TimMess {
    private String id;

    private Integer endrow;

    private Integer firstpage;

    private Boolean hasnextpage;

    private Boolean haspreviouspage;

    private Boolean isfirstpage;

    private Boolean islastpage;

    private Integer lastpage;

    private Integer nextpage;

    private Integer pagenum;

    private Integer pagesize;

    private Integer pages;

    private Integer prepage;

    private Integer size;

    private Integer startrow;

    private Integer total;

    private Integer appnum;

    private Integer getnum;

    private Date searchtime;

    private Date rqMake;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getEndrow() {
        return endrow;
    }

    public void setEndrow(Integer endrow) {
        this.endrow = endrow;
    }

    public Integer getFirstpage() {
        return firstpage;
    }

    public void setFirstpage(Integer firstpage) {
        this.firstpage = firstpage;
    }

    public Boolean getHasnextpage() {
        return hasnextpage;
    }

    public void setHasnextpage(Boolean hasnextpage) {
        this.hasnextpage = hasnextpage;
    }

    public Boolean getHaspreviouspage() {
        return haspreviouspage;
    }

    public void setHaspreviouspage(Boolean haspreviouspage) {
        this.haspreviouspage = haspreviouspage;
    }

    public Boolean getIsfirstpage() {
        return isfirstpage;
    }

    public void setIsfirstpage(Boolean isfirstpage) {
        this.isfirstpage = isfirstpage;
    }

    public Boolean getIslastpage() {
        return islastpage;
    }

    public void setIslastpage(Boolean islastpage) {
        this.islastpage = islastpage;
    }

    public Integer getLastpage() {
        return lastpage;
    }

    public void setLastpage(Integer lastpage) {
        this.lastpage = lastpage;
    }

    public Integer getNextpage() {
        return nextpage;
    }

    public void setNextpage(Integer nextpage) {
        this.nextpage = nextpage;
    }

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPrepage() {
        return prepage;
    }

    public void setPrepage(Integer prepage) {
        this.prepage = prepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStartrow() {
        return startrow;
    }

    public void setStartrow(Integer startrow) {
        this.startrow = startrow;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getAppnum() {
        return appnum;
    }

    public void setAppnum(Integer appnum) {
        this.appnum = appnum;
    }

    public Integer getGetnum() {
        return getnum;
    }

    public void setGetnum(Integer getnum) {
        this.getnum = getnum;
    }

    public Date getSearchtime() {
        return searchtime;
    }

    public void setSearchtime(Date searchtime) {
        this.searchtime = searchtime;
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
        sb.append(", endrow=").append(endrow);
        sb.append(", firstpage=").append(firstpage);
        sb.append(", hasnextpage=").append(hasnextpage);
        sb.append(", haspreviouspage=").append(haspreviouspage);
        sb.append(", isfirstpage=").append(isfirstpage);
        sb.append(", islastpage=").append(islastpage);
        sb.append(", lastpage=").append(lastpage);
        sb.append(", nextpage=").append(nextpage);
        sb.append(", pagenum=").append(pagenum);
        sb.append(", pagesize=").append(pagesize);
        sb.append(", pages=").append(pages);
        sb.append(", prepage=").append(prepage);
        sb.append(", size=").append(size);
        sb.append(", startrow=").append(startrow);
        sb.append(", total=").append(total);
        sb.append(", appnum=").append(appnum);
        sb.append(", getnum=").append(getnum);
        sb.append(", searchtime=").append(searchtime);
        sb.append(", rqMake=").append(rqMake);
        sb.append("]");
        return sb.toString();
    }
}