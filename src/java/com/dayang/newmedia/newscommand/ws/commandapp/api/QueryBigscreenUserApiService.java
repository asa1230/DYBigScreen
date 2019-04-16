package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public abstract class QueryBigscreenUserApiService {
	public abstract Response queryBigscreenUser(String name,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response queryAllBigscreen(SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response queryBigscreenUserByID(String guid,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response updateTenant(String perdate,HttpServletRequest request)throws NotFoundException;
	
	public abstract Response deleteTenant(String perdate,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response changeOpenTenant(String perdate,SecurityContext securityContext)throws NotFoundException;
	
	public abstract Response changeCloseTenant(String perdate,SecurityContext securityContext)throws NotFoundException;
	
}
