package com.openmirrorapi.resource;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class SubscriptionResource {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key KEY; 

	@Persistent private String kind = "mirror#subscription";
	@Persistent private String id;
	@Persistent private Date updated;
	@Persistent private String collection;
	@Persistent private String[] operation;
	@Persistent private String callbackUrl;
	@Persistent private String verifyToken;
	@Persistent private String userToken;
	@Persistent private SubscriptionNotificationResource notification;
	
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
