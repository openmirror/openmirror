package com.openmirrorapi.resource;

import java.util.Date;

public class SubscriptionResource {

	private String kind = "mirror#subscription";
	private String id;
	private Date updated;
	private String collection;
	private String[] operation;
	private String callbackUrl;
	private String verifyToken;
	private String userToken;
	private SubscriptionNotificationResource notification;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getUpdated() {
		return updated;
	}
	
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	public String getCollection() {
		return collection;
	}
	
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	public String[] getOperation() {
		return operation;
	}
	
	public void setOperation(String[] operation) {
		this.operation = operation;
	}
	
	public String getCallbackUrl() {
		return callbackUrl;
	}
	
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
	public String getVerifyToken() {
		return verifyToken;
	}
	
	public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}
	
	public String getUserToken() {
		return userToken;
	}
	
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
	public SubscriptionNotificationResource getNotification() {
		return notification;
	}
	
	public void setNotification(SubscriptionNotificationResource notification) {
		this.notification = notification;
	}
}
