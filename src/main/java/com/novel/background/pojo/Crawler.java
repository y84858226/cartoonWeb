package com.novel.background.pojo;

public class Crawler {
	private Integer id;
	private String crawlerName;
	private String crawlerUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCrawlerName() {
		return crawlerName;
	}
	public void setCrawlerName(String crawlerName) {
		this.crawlerName = crawlerName;
	}
	public String getCrawlerUrl() {
		return crawlerUrl;
	}
	public void setCrawlerUrl(String crawlerUrl) {
		this.crawlerUrl = crawlerUrl;
	}
	
	@Override
	public String toString() {
		return "Crawler [id=" + id + ", crawlerName=" + crawlerName + ", crawlerUrl=" + crawlerUrl
			+ "]";
	}
	
}