package com.openmirrorapi.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.openmirrorapi.resource.SubscriptionResource;
import com.openmirrorapi.resource.SubscriptionsList;

@Path("/subscriptions")
public class SubscriptionService {

	// delete -> https://developers.google.com/glass/v1/reference/subscriptions/delete	
	@DELETE
	@Produces("application/json")
	@Path("/{id}")
	public String deleteSubscriptionResource(@PathParam("id") String id) {
		return "@DELETE - itemId["+ id +"]";
	}

	// insert -> https://developers.google.com/glass/v1/reference/subscriptions/insert
	@POST
	@Produces("application/json")
	public SubscriptionResource insertSubscription(SubscriptionResource subscriptionResource) {
		
		return subscriptionResource;
	}
	
	// list -> https://developers.google.com/glass/v1/reference/subscriptions/list
	@GET
	@Produces("application/json")
	public SubscriptionsList listSubscriptionResources() {
		SubscriptionResource[] subscriptionResourceList = new SubscriptionResource[1];
		
		SubscriptionResource subscriptionResource = new SubscriptionResource();
		subscriptionResourceList[0] = subscriptionResource;
		
		SubscriptionsList subscriptionsList = new SubscriptionsList();
		subscriptionsList.setItems(subscriptionResourceList);
		
		return subscriptionsList;
	}
	
	// update -> https://developers.google.com/glass/v1/reference/subscriptions/update
	@PUT
	@Produces("application/json")
	@Path("{id}")
	public SubscriptionResource updateSubscriptionResource(@PathParam("id") String id) {
		SubscriptionResource subscriptionResource = new SubscriptionResource();
		subscriptionResource.setId(id);
		
		return subscriptionResource;
	}
	
}
