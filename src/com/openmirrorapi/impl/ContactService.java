package com.openmirrorapi.impl;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
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

import com.openmirrorapi.resource.ContactResource;
import com.openmirrorapi.resource.ContactsList;
import com.openmirrorapi.resource.SubscriptionResource;
import com.openmirrorapi.resource.SubscriptionsList;
import com.openmirrorapi.server.db.PMF;

@Path("/contacts")
public class ContactService {
	
	// delete -> https://developers.google.com/glass/v1/reference/contacts/delete
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response deleteContactResource(@PathParam("id") String id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			Query query = pm.newQuery(ContactResource.class);
			query.setFilter("id == :id");
			query.setRange(0, 1);
			
			List<ContactResource> results = (List<ContactResource>)query.execute(id);
			
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
	
	// get -> https://developers.google.com/glass/v1/reference/contacts/get
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getContactResource(@PathParam("id") String id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			Query query = pm.newQuery(ContactResource.class);
			query.setFilter("id == :id");
			query.setRange(0, 1);
			
			List<ContactResource> results = (List<ContactResource>)query.execute(id);
			
			if(results.size() > 0)
				return Response.ok(results.get(0)).build();
				
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}

		return Response.ok().build();
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/contacts/insert
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertContactResource(ContactResource contactResource) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			pm.makePersistent(contactResource);
				
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
		return Response.ok(contactResource).build();
	}
	
	// list -> https://developers.google.com/glass/v1/reference/contacts/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listContactResources() {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		ContactsList contactsList = new ContactsList();
		
		try {			
			
			Query query = pm.newQuery(ContactResource.class);
			List<ContactResource> results = (List<ContactResource>)query.execute();
			
			ContactResource[] contactResources = new ContactResource[results.size()];
			int i = 0;
			for(ContactResource contactResource : results) {
			
				contactResources[i] = contactResource;
				
				i++;
			}	
			
			contactsList.setItems(contactResources);
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
		return Response.ok(contactsList).build();
	}
	
	// patch -> https://developers.google.com/glass/v1/reference/contacts/patch
	//TODO @PATCH
	/*@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public ContactResource patchContactResource(@PathParam("id") String id, ContactResource contactResource) {
		contactResource.setId(id);
		
		return contactResource;
	}*/
	
	// updated -> https://developers.google.com/glass/v1/reference/contacts/update
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response updateContactResource(@PathParam("id") String id, ContactResource contactResource) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			Query query = pm.newQuery(ContactResource.class);
			query.setFilter("id == :id");
			query.setRange(0, 1);
			
			List<ContactResource> results = (List<ContactResource>)query.execute(id);
			
			if(results.size() > 0) {
				ContactResource contactResourceDB = results.get(0);
				
				contactResourceDB.setSource(contactResource.getSource());
				contactResourceDB.setDisplayName(contactResource.getDisplayName());
				contactResourceDB.setImageUrls(contactResource.getImageUrls());
				contactResourceDB.setType(contactResource.getType());
				contactResourceDB.setAcceptTypes(contactResource.getAcceptTypes());
				contactResourceDB.setPhoneNumber(contactResource.getPhoneNumber());
				contactResourceDB.setPriority(contactResource.getPriority());
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		} finally {
			pm.close();
		}

		return Response.ok().build();
	}
	
}
