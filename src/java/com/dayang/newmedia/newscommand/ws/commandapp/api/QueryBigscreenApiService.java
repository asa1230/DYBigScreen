package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public abstract class QueryBigscreenApiService {
	public abstract Response queryBigscreen(HttpServletRequest request)throws NotFoundException;
	
	public abstract Response addBigscreen(String perdate,HttpServletRequest request)throws NotFoundException;
	
	public abstract Response updateBigscreen(String perdate,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response deleteBigscreen(String perdate,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response queryOtherBigscreen(String perdate,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response queryOtherBigscreenByID(String perdate,SecurityContext securityContext)throws NotFoundException;
	
}
