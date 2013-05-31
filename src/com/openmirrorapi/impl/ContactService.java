package com.openmirrorapi.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.openmirrorapi.resource.ContactResource;
import com.openmirrorapi.resource.ContactsList;

@Path("/contacts")
public class ContactService {
	
	// delete -> https://developers.google.com/glass/v1/reference/contacts/delete
	@DELETE
	@Produces("application/json")
	@Path("{id}")
	public String deleteContactResource(@PathParam("id") String id) {
		return "@DELETE - id["+ id +"]";
	}
	
	// get -> https://developers.google.com/glass/v1/reference/contacts/get
	@GET
	@Produces("application/json")
	@Path("{id}")
	public ContactResource getContactResource(@PathParam("id") String id) {
		ContactResource contactResource = new ContactResource();
		contactResource.setId(id);
		
		return contactResource;
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/contacts/insert
	@POST
	@Produces("application/json")
	public ContactResource insertContactResource(ContactResource contactResource) {
		
		return contactResource;
	}
	
	// list -> https://developers.google.com/glass/v1/reference/contacts/list
	@GET
	@Produces("application/json")
	public ContactsList listContactResources() {
		ContactResource[] contactResourcesList = new ContactResource[1];
		
		ContactResource contactResource = new ContactResource();
		contactResourcesList[0] = contactResource;
		
		ContactsList contactsList = new ContactsList();
		contactsList.setItems(contactResourcesList);
		
		return contactsList;
	}
	
	// patch -> https://developers.google.com/glass/v1/reference/contacts/patch
	//TODO @PATCH
	@Produces("application/json")
	@Path("{id}")
	public ContactResource patchContactResource(@PathParam("id") String id, ContactResource contactResource) {
		contactResource.setId(id);
		
		return contactResource;
	}
	
	// updated -> https://developers.google.com/glass/v1/reference/contacts/update
	@PUT
	@Produces("application/json")
	@Path("{id}")
	public ContactResource updateContactResource(@PathParam("id") String id, ContactResource contactResource) {
		contactResource.setId(id);
		
		return contactResource;
	}
	
}
