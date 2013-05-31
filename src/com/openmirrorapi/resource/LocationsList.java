package com.openmirrorapi.resource;

public class LocationsList {

	private String kind = "mirror#locationsList";
	private LocationResource[] items;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public LocationResource[] getItems() {
		return items;
	}
	
	public void setItems(LocationResource[] items) {
		this.items = items;
	}
}
