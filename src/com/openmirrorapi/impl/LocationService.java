package com.openmirrorapi.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.openmirrorapi.resource.LocationResource;
import com.openmirrorapi.resource.LocationsList;

@Path("/location")
public class LocationService {

	// get -> https://developers.google.com/glass/v1/reference/locations/get
	@GET
	@Produces("application/json")
	@Path("{id}")
	public LocationResource getLocationResource(@PathParam("id") String id) {
		LocationResource locationResource = new LocationResource();
		locationResource.setId(id);
		
		return locationResource;
	}
	
	// list -> https://developers.google.com/glass/v1/reference/locations/list
	@GET
	@Produces("application/json")
	public LocationsList listLocationResource() {
		LocationResource[] locationResourcesList = new LocationResource[1];
		
		LocationResource locationResource = new LocationResource();
		locationResourcesList[0] = locationResource;

		LocationsList locationsList = new LocationsList();
		locationsList.setItems(locationResourcesList);
		
		return locationsList;
		
	}
	
}
