package com.openmirrorapi.resource;

import java.util.Date;

public class NotificationResource {

	private String level;
	private Date deliveryTime;
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}
