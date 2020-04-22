package com.guapi.starter.mongo.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Neo 定义页面的实体类
 */
@Document(collection = "ex_sx_html")
public class SXHtml implements Serializable{
	private String author;
	private String cityCode;
	private int crtAppSysId;
	private long crtTime;
	private String crtTime2;
	private String crtUserId;
	private String detailContent;
	private String ext1;
	private String ext2;
	private String firstType;
	@Id
	private String id;
	private String introduce;
	private String keyword;
	private String lsTop;
	private String provCode;
	private String pubPrsn;
	private Date pubTime;
	private String secondType;
	private String source;
	private String status;
	private String stick;
	private String thirdType;
	private String title;
	private String validStsCd;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public int getCrtAppSysId() {
		return crtAppSysId;
	}
	public void setCrtAppSysId(int crtAppSysId) {
		this.crtAppSysId = crtAppSysId;
	}
	public long getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(long crtTime) {
		this.crtTime = crtTime;
	}
	public String getCrtTime2() {
		return crtTime2;
	}
	public void setCrtTime2(String crtTime2) {
		this.crtTime2 = crtTime2;
	}
	public String getCrtUserId() {
		return crtUserId;
	}
	public void setCrtUserId(String crtUserId) {
		this.crtUserId = crtUserId;
	}
	public String getDetailContent() {
		return detailContent;
	}
	public void setDetailContent(String detailContent) {
		this.detailContent = detailContent;
	}
	public String getExt1() {
		return ext1;
	}
	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
	public String getExt2() {
		return ext2;
	}
	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}
	public String getFirstType() {
		return firstType;
	}
	public void setFirstType(String firstType) {
		this.firstType = firstType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getLsTop() {
		return lsTop;
	}
	public void setLsTop(String lsTop) {
		this.lsTop = lsTop;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getPubPrsn() {
		return pubPrsn;
	}
	public void setPubPrsn(String pubPrsn) {
		this.pubPrsn = pubPrsn;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	public String getSecondType() {
		return secondType;
	}
	public void setSecondType(String secondType) {
		this.secondType = secondType;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStick() {
		return stick;
	}
	public void setStick(String stick) {
		this.stick = stick;
	}
	public String getThirdType() {
		return thirdType;
	}
	public void setThirdType(String thirdType) {
		this.thirdType = thirdType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValidStsCd() {
		return validStsCd;
	}
	public void setValidStsCd(String validStsCd) {
		this.validStsCd = validStsCd;
	}
	@Override
	public String toString() {
		return "SXHtml [author=" + author + ", cityCode=" + cityCode + ", crtAppSysId=" + crtAppSysId + ", crtTime="
				+ crtTime + ", crtTime2=" + crtTime2 + ", crtUserId=" + crtUserId + ", detailContent=" + detailContent
				+ ", ext1=" + ext1 + ", ext2=" + ext2 + ", firstType=" + firstType + ", id=" + id + ", introduce="
				+ introduce + ", keyword=" + keyword + ", lsTop=" + lsTop + ", provCode=" + provCode + ", pubPrsn="
				+ pubPrsn + ", pubTime=" + pubTime + ", secondType=" + secondType + ", source=" + source + ", status="
				+ status + ", stick=" + stick + ", thirdType=" + thirdType + ", title=" + title + ", validStsCd="
				+ validStsCd + "]";
	}
	
}
