package com.openmirrorapi.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TimelineResource {

	private String id;
	
	public TimelineResource(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
