package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Topic 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int topicId;
	private String topicTitle;
	private String topicDesc;
	@ManyToOne
	private User userId;
	
	public Topic() {
		super();
	}

	public Topic(int topicId, String topicTitle, String topicDesc, User userId) {
		super();
		this.topicId = topicId;
		this.topicTitle = topicTitle;
		this.topicDesc = topicDesc;
		this.userId = userId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicTitle=" + topicTitle + ", topicDesc=" + topicDesc + ", userId="
				+ userId + "]";
	}
	
	
	
	

}
