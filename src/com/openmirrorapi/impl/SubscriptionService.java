package com.openmirrorapi.impl;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
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
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			
			Query query = pm.newQuery(SubscriptionResource.class, "id == :id");
			query.setRange(0, 1);
			List<SubscriptionResource> results = (List<SubscriptionResource>)query.execute(id);
			
			if(results.size() > 0)
				pm.deletePersistent(results.get(0));
				
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
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
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		SubscriptionsList subscriptionsList = new SubscriptionsList();
		
		try {			
			
			Query query = pm.newQuery(SubscriptionResource.class);
			List<SubscriptionResource> results = (List<SubscriptionResource>)query.execute();
			
			SubscriptionResource[] subscriptionResources = new SubscriptionResource[results.size()];
			int i = 0;
			for(SubscriptionResource subscriptionResource : results) {
			
				subscriptionResources[i] = subscriptionResource;
				
				i++;
			}	
			
			subscriptionsList.setItems(subscriptionResources);
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
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