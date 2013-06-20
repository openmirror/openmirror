package com.openmirrorapi.resource;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class SubscriptionNotificationResource {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key KEY;
	
	@Persistent private String collection;
	@Persistent private String itemId;
	@Persistent private String operation;
	@Persistent private UserActionResource[] userActions;
	@Persistent private String verifyToken;
	@Persistent private String userToken;
	
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