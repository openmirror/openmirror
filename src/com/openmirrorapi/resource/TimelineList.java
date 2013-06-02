package com.openmirrorapi.resource;

public class TimelineList {

	private String kind = "mirror#timeline";
	private String nextPageToken;
	private TimelineResource[] items;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
	
	public TimelineResource[] getItems() {
		return items;
	}
	
	public void setItems(TimelineResource[] items) {
		this.items = items;
	}
}
