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

import com.openmirrorapi.resource.ContactResource;
import com.openmirrorapi.resource.ContactsList;

@Path("/contacts")
public class ContactService {
	
	// delete -> https://developers.google.com/glass/v1/reference/contacts/delete
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response deleteContactResource(@PathParam("id") String id) {

		return Response.ok().build();
	}
	
	// get -> https://developers.google.com/glass/v1/reference/contacts/get
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getContactResource(@PathParam("id") String id) {
		ContactResource contactResource = new ContactResource();
		contactResource.setId(id);
		
		return Response.ok(contactResource).build();
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/contacts/insert
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertContactResource(ContactResource contactResource) {
		
		return Response.ok(contactResource).build();
	}
	
	// list -> https://developers.google.com/glass/v1/reference/contacts/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listContactResources() {
		ContactResource[] contactResourcesList = new ContactResource[2];
		
		ContactResource contactResource = new ContactResource();
		contactResource.setId("contact#1");
		contactResourcesList[0] = contactResource;
		
		ContactResource contactResource2 = new ContactResource();
		contactResource2.setId("contact#2");
		contactResourcesList[1] = contactResource2;
		
		ContactsList contactsList = new ContactsList();
		contactsList.setItems(contactResourcesList);
		
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
		contactResource.setId(id);
		
		return Response.ok(contactResource).build();
	}
	
}
