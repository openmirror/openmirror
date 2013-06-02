package com.openmirrorapi.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.openmirrorapi.resource.LocationResource;
import com.openmirrorapi.resource.LocationsList;

@Path("/location")
public class LocationService {

	// get -> https://developers.google.com/glass/v1/reference/locations/get
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
//	public LocationResource getLocationResource(@PathParam("id") String id) {
	public Response getLocationResource(@PathParam("id") String id) {
		LocationResource locationResource = new LocationResource();
		locationResource.setId(id);
		
//		return locationResource;
		return Response.ok(locationResource).build();
	}
	
	// list -> https://developers.google.com/glass/v1/reference/locations/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
//	public LocationsList listLocationResource() {
	public Response listLocationResource() {
		LocationResource[] locationResourcesList = new LocationResource[2];
		
		LocationResource locationResource = new LocationResource();
		locationResource.setId("location#1");
		locationResourcesList[0] = locationResource;

		LocationResource locationResource2 = new LocationResource();
		locationResource2.setId("location#2");
		locationResourcesList[1] = locationResource2;
		
		LocationsList locationsList = new LocationsList();
		locationsList.setItems(locationResourcesList);
		
//		return locationsList;
		return Response.ok(locationsList).build();
		
	}
	
}
