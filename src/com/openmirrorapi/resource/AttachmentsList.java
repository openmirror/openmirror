package com.openmirrorapi.resource;

public class AttachmentsList {

	private String kind = "mirror#attachmentsList";
	private AttachmentResource[] items;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public AttachmentResource[] getItems() {
		return items;
	}
	
	public void setItems(AttachmentResource[] items) {
		this.items = items;
	}
}
