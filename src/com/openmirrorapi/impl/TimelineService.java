package com.openmirrorapi.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.openmirrorapi.resource.TimelineList;
import com.openmirrorapi.resource.TimelineResource;

@Path("/timeline")
public class TimelineService {

	// get -> https://developers.google.com/glass/v1/reference/timeline/get
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getTimelineItem(@PathParam("id") String id) {
		
		TimelineResource timelineResource = new TimelineResource();
		timelineResource.setId(id);
		
		return Response.ok(timelineResource).build();
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/timeline/insert
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postTimelineItem(TimelineResource timelineResource) {
		
		return Response.ok(timelineResource).build();
	}
	
	// delete -> https://developers.google.com/glass/v1/reference/timeline/delete
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response deleteTimelineItem(@PathParam("id") String id) {

		return Response.ok().build();
	}

	// list -> https://developers.google.com/glass/v1/reference/timeline/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTimeline() {
		TimelineResource[] timelineResourcesList = new TimelineResource[2];
		
		TimelineResource timelineResource = new TimelineResource();
		timelineResource.setId("timeline#1");
		timelineResourcesList[0] = timelineResource;
		
		TimelineResource timelineResource2 = new TimelineResource();
		timelineResource2.setId("timeline#2");
		timelineResourcesList[1] = timelineResource2;
		
		TimelineList timelineList = new TimelineList();
		timelineList.setItems(timelineResourcesList);
		
		return Response.ok(timelineList).build();
	}
	
	// patch -> https://developers.google.com/glass/v1/reference/timeline/patch
	//TODO @PATCH
	/*@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public String patchTimelineItem(@PathParam("id") String id, TimelineResource timelineResource) {
		return "Hello World!";
	}*/
	
	// update -> https://developers.google.com/glass/v1/reference/timeline/update
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response updateTimelineItem(@PathParam("id") String id, TimelineResource timelineResource) {
		timelineResource.setId(id);
		
		return Response.ok(timelineResource).build();
	}
}
