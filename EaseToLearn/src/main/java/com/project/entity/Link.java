package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Link {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int linkId;
	private String linkURL;
	private String linkTitle;
	@OneToMany
	private Topic topicId;
	
	public Link() {
		super();
	}

	public Link(int linkId, String linkURL, String linkTitle, Topic topicId) {
		super();
		this.linkId = linkId;
		this.linkURL = linkURL;
		this.linkTitle = linkTitle;
		this.topicId = topicId;
	}

	public int getLinkId() {
		return linkId;
	}

	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}

	public String getLinkURL() {
		return linkURL;
	}

	public void setLinkURL(String linkURL) {
		this.linkURL = linkURL;
	}

	public String getLinkTitle() {
		return linkTitle;
	}

	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

	public Topic getTopicId() {
		return topicId;
	}

	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}

	@Override
	public String toString() {
		return "Link [linkId=" + linkId + ", linkURL=" + linkURL + ", linkTitle=" + linkTitle + ", topicId=" + topicId
				+ "]";
	}
	
	
	

}
