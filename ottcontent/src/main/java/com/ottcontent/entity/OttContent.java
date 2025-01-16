package com.ottcontent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ott_content")
public class OttContent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "content_id")
	private long contentId;
	
	@Column(name = "content_name")
	private String contentName;
	
	@Column(name = "content_run_time")
	private long contentRunTime;
	
	public OttContent() {
		super();
	}

	public long getContentId() {
		return contentId;
	}

	public void setContentId(long contentId) {
		this.contentId = contentId;
	}

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public long getContentRunTime() {
		return contentRunTime;
	}

	public void setContentRunTime(long contentRunTime) {
		this.contentRunTime = contentRunTime;
	}

	public OttContent(long contentId, String contentName, long contentRunTime) {
		super();
		this.contentId = contentId;
		this.contentName = contentName;
		this.contentRunTime = contentRunTime;
	}

	@Override
	public String toString() {
		return "OttContent [contentId=" + contentId + ", contentName=" + contentName + ", contentRunTime="
				+ contentRunTime + "]";
	}
}
