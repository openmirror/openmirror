package com.openmirrorapi.impl;

import javax.jdo.PersistenceManager;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.openmirrorapi.resource.SubscriptionResource;
import com.openmirrorapi.resource.SubscriptionsList;
import com.openmirrorapi.server.db.PMF;

@Path("/subscriptions")
public class SubscriptionService {

	// delete -> https://developers.google.com/glass/v1/reference/subscriptions/delete	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response deleteSubscriptionResource(@PathParam("id") String id) {

		return Response.ok().build();
	}

	// insert -> https://developers.google.com/glass/v1/reference/subscriptions/insert
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertSubscription(SubscriptionResource subscriptionResource) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			if(subscriptionResource.getCallbackUrl() != null && subscriptionResource.getCollection() != null) {
				pm.makePersistent(subscriptionResource);
				
			} else {
				return Response.status(400).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
		return Response.ok(subscriptionResource).build();
	}
	
	// list -> https://developers.google.com/glass/v1/reference/subscriptions/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listSubscriptionResources() {
		SubscriptionResource[] subscriptionResourceList = new SubscriptionResource[2];
		
		SubscriptionResource subscriptionResource = new SubscriptionResource();
		subscriptionResource.setId("subscription#1");
		subscriptionResourceList[0] = subscriptionResource;
		
		SubscriptionResource subscriptionResource2 = new SubscriptionResource();
		subscriptionResource2.setId("subscription#2");
		subscriptionResourceList[1] = subscriptionResource2;
		
		SubscriptionsList subscriptionsList = new SubscriptionsList();
		subscriptionsList.setItems(subscriptionResourceList);
		
		return Response.ok(subscriptionsList).build();
	}
	
	// update -> https://developers.google.com/glass/v1/reference/subscriptions/update
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response updateSubscriptionResource(@PathParam("id") String id, SubscriptionResource subscriptionResource) {
		subscriptionResource.setId(id);
		
		return Response.ok(subscriptionResource).build();
	}
}