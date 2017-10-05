package org.comcast.excersice.validate;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.api.client.ClientResponse.Status;

@Provider
public class NotActiveExceptionMapper implements  ExceptionMapper<NotActiveException>{

	@Override
	public Response toResponse(NotActiveException ex) {
		// TODO Auto-generated method stub
		ErrorDto error = new ErrorDto("3100",ex.getMessage());
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
