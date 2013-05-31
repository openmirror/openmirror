package com.openmirrorapi.impl;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.openmirrorapi.resource.AttachmentResource;
import com.openmirrorapi.resource.AttachmentsList;

@Path("/timeline/{itemId}/attachments")
public class AttachmentService {

	// get -> https://developers.google.com/glass/v1/reference/timeline/attachments/get
	@GET
	@Produces("application/json")
	@Path("/{attachmentId}")
	public AttachmentResource getAttachmentResource(@PathParam("itemId") String itemId, @PathParam("attachmentId") String attachmentId) {
		AttachmentResource attachmentResource = new AttachmentResource();
		attachmentResource.setId(attachmentId);
		
		return attachmentResource;
	}
	
	// delete -> https://developers.google.com/glass/v1/reference/timeline/attachments/delete
	@DELETE
	@Produces("application/json")
	@Path("/{attachmentId}")
	public String deleteAttachmentResource(@PathParam("itemId") String itemId, @PathParam("attachmentId") String attachmentId) {
		return "@DELETE - itemId["+ itemId +"] - attachmentId["+ attachmentId +"]";
	}
	
	// insert -> https://developers.google.com/glass/v1/reference/timeline/attachments/insert
	@POST
	@Produces("application/json")
	public AttachmentResource insertAttachment(@PathParam("itemId") String itemId, @QueryParam("uploadType") String uploadType) {
		AttachmentResource attachmentResource = new AttachmentResource();
		attachmentResource.setContentType(uploadType);
		
		return attachmentResource;
	}
	
	// list -> https://developers.google.com/glass/v1/reference/timeline/attachments/list
	@GET
	@Produces("application/json")
	public AttachmentsList listAttachmentResources(@PathParam("itemId") String itemId) {
		AttachmentResource[] attachmentResourceList = new AttachmentResource[1];
		
		AttachmentResource attachmentResource = new AttachmentResource();
		attachmentResourceList[0] = attachmentResource;
		
		AttachmentsList attachmentsList = new AttachmentsList();
		attachmentsList.setItems(attachmentResourceList);
		
		return attachmentsList;
	}
}