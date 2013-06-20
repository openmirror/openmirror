package com.openmirrorapi.impl;

import javax.jdo.PersistenceManager;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.openmirrorapi.resource.AttachmentResource;
import com.openmirrorapi.resource.AttachmentsList;
import com.openmirrorapi.server.db.PMF;

@Path("/timeline/{itemId}/attachments")
public class AttachmentService {

	// get -> https://developers.google.com/glass/v1/reference/timeline/attachments/get
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{attachmentId}")
	public Response getAttachmentResource(@PathParam("itemId") String itemId, @PathParam("attachmentId") String attachmentId) {
		AttachmentResource attachmentResource = new AttachmentResource();
		attachmentResource.setId(attachmentId);
		
		return Response.ok(attachmentResource).build();
	}
	
	// delete -> https://developers.google.com/glass/v1/reference/timeline/attachments/delete
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{attachmentId}")
	public Response deleteAttachmentResource(@PathParam("itemId") String itemId, @PathParam("attachmentId") String attachmentId) {
		
		return Response.ok().build();
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/timeline/attachments/insert
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertAttachment(@PathParam("itemId") String itemId, @QueryParam("uploadType") String uploadType) {	
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		AttachmentResource attachmentResource = new AttachmentResource();
		
		try{
			attachmentResource.setContentType(uploadType);
			
			pm.makePersistent(attachmentResource);
			
		} catch (Exception e) {
			return Response.serverError().build();
		} finally {
			pm.close();
		}
		
		return Response.ok(attachmentResource).build();
	}
	
	// list -> https://developers.google.com/glass/v1/reference/timeline/attachments/list
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listAttachmentResources(@PathParam("itemId") String itemId) {
		AttachmentResource[] attachmentResourceList = new AttachmentResource[2];
		
		AttachmentResource attachmentResource = new AttachmentResource();
		attachmentResource.setId("attachment#1");
		attachmentResourceList[0] = attachmentResource;
		
		AttachmentResource attachmentResource2 = new AttachmentResource();
		attachmentResource2.setId("attachment#2");
		attachmentResourceList[1] = attachmentResource2;
		
		AttachmentsList attachmentsList = new AttachmentsList();
		attachmentsList.setItems(attachmentResourceList);
		
		return Response.ok(attachmentsList).build();
	}
}