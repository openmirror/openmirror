package com.openmirrorapi.resource;

public class ContactsList {

	private String kind = "mirror#contacts";
	private ContactResource[] items;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public ContactResource[] getItems() {
		return items;
	}
	
	public void setItems(ContactResource[] items) {
		this.items = items;
	}
}
