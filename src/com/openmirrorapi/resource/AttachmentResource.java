package com.openmirrorapi.resource;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class AttachmentResource {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String id;
	@Persistent private String contentType;
	@Persistent private String contentUrl;
	@Persistent private Boolean isProcessingContent;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public Boolean getIsProcessingContent() {
		return isProcessingContent;
	}

	public void setIsProcessingContent(Boolean isProcessingContent) {
		this.isProcessingContent = isProcessingContent;
	}
}
