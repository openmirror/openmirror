package com.openmirrorapi.resource;

public class SubscriptionNotificationResource {

	private String collection;
	private String itemId;
	private String operation;
	private UserActionResource[] userActions;
	private String verifyToken;
	private String userToken;
	
	public String getCollection() {
		return collection;
	}
	
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public UserActionResource[] getUserActions() {
		return userActions;
	}
	
	public void setUserActions(UserActionResource[] userActions) {
		this.userActions = userActions;
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
}