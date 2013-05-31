package com.openmirrorapi.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.openmirrorapi.resource.TimelineResource;

@Path("/timeline")
public class TimelineService {

	@GET
	@Produces("application/json")
	public String getTimeline() {
		return "Hello World!";
	}
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public TimelineResource getTimelineItem(@PathParam("id") String id) {
		return new TimelineResource(id);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public TimelineResource postTimelineItem(TimelineResource timelineResource) {
		return timelineResource;
	}
	
	@DELETE
	@Produces("application/json")
	@Path("/{id}")
	public String deleteTimelineItem(@PathParam("id") String id) {
		return "Hello World!";
	}
	
	@PUT
	@Produces("application/json")
	@Path("/{id}")
	public String updateTimelineItem(@PathParam("id") String id) {
		return "Hello World!";
	}
	
	//TODO @PATCH
	@Produces("application/json")
	@Path("/{id}")
	public String patchTimelineItem(@PathParam("id") String id) {
		return "Hello World!";
	}
}