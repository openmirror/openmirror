package com.openmirrorapi.resource;

public class AttachmentResource {

	private String id;
	private String contentType;
	private String contentUrl;
	private Boolean isProcessingContent;
	
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
