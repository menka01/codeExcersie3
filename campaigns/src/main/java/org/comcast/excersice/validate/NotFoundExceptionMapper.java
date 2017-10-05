package org.comcast.excersice.validate;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.sun.jersey.api.client.ClientResponse.Status;

public class NotFoundExceptionMapper implements  ExceptionMapper<NotFoundException>{
	
	
	@Override
	public Response toResponse(NotFoundException ex) {
		// TODO Auto-generated method stub
		ErrorDto error = new ErrorDto("404",ex.getMessage());
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
