package com.openmirrorapi.resource;

import java.util.Date;

public class TimelineResource {

	private String kind = "mirror#timelineItem";
	private String id;
	private String sourceItemId;
	private String canonicalUrl;
	private String bundleId;
	private Boolean isBundleCover;
	private String selfLink;
	private Date created;
	private Date updated;
	private Date displayTime;
	private Boolean isPinned;
	private Integer pinScore;
	private Boolean isDeleted;
	private String etag;
	private ContactResource creator;
	private ContactResource[] recipients;
	private String inReplyTo;
	private String title;
	private String text;
	private String html;
	private String[] htmlPages;
	private String speakableText;
	private AttachmentResource[] attachments;
	private LocationResource location;
	private MenuItemResource[] menuItems;
	private NotificationResource notification;
	
	public TimelineResource() {
	}
	
	public TimelineResource(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSourceItemId() {
		return sourceItemId;
	}

	public void setSourceItemId(String sourceItemId) {
		this.sourceItemId = sourceItemId;
	}

	public String getCanonicalUrl() {
		return canonicalUrl;
	}

	public void setCanonicalUrl(String canonicalUrl) {
		this.canonicalUrl = canonicalUrl;
	}

	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public Boolean getIsBundleCover() {
		return isBundleCover;
	}

	public void setIsBundleCover(Boolean isBundleCover) {
		this.isBundleCover = isBundleCover;
	}

	public String getSelfLink() {
		return selfLink;
	}

	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getDisplayTime() {
		return displayTime;
	}

	public void setDisplayTime(Date displayTime) {
		this.displayTime = displayTime;
	}

	public Boolean getIsPinned() {
		return isPinned;
	}

	public void setIsPinned(Boolean isPinned) {
		this.isPinned = isPinned;
	}

	public Integer getPinScore() {
		return pinScore;
	}

	public void setPinScore(Integer pinScore) {
		this.pinScore = pinScore;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public ContactResource getCreator() {
		return creator;
	}

	public void setCreator(ContactResource creator) {
		this.creator = creator;
	}

	public ContactResource[] getRecipients() {
		return recipients;
	}

	public void setRecipients(ContactResource[] recipients) {
		this.recipients = recipients;
	}

	public String getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String[] getHtmlPages() {
		return htmlPages;
	}

	public void setHtmlPages(String[] htmlPages) {
		this.htmlPages = htmlPages;
	}

	public String getSpeakableText() {
		return speakableText;
	}

	public void setSpeakableText(String speakableText) {
		this.speakableText = speakableText;
	}

	public AttachmentResource[] getAttachments() {
		return attachments;
	}

	public void setAttachments(AttachmentResource[] attachments) {
		this.attachments = attachments;
	}

	public LocationResource getLocation() {
		return location;
	}

	public void setLocation(LocationResource location) {
		this.location = location;
	}

	public MenuItemResource[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItemResource[] menuItems) {
		this.menuItems = menuItems;
	}

	public NotificationResource getNotification() {
		return notification;
	}

	public void setNotification(NotificationResource notification) {
		this.notification = notification;
	}

	public void setId(String id) {
		this.id = id;
	}
}
