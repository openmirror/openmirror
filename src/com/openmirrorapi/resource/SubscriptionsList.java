package com.openmirrorapi.resource;

public class SubscriptionsList {

	private String kind = "mirror#subscriptionsList";
	private SubscriptionResource[] items;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public SubscriptionResource[] getItems() {
		return items;
	}
	
	public void setItems(SubscriptionResource[] items) {
		this.items = items;
	}
}
