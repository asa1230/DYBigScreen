package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.db.model.BigscreenUser;
import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryBigscreenUserApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBigscreenUserResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryProgramRatingResponse;

import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;

@Path("/queryBigscreenUser")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryBigscreen API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryBigscreenUserApi {

	private final QueryBigscreenUserApiService delegate = QueryBigscreenUserApiServiceFactory.getQueryBigscreenUserApi();

    @POST
    @Path("/queryAll")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response queryAll(@ApiParam(value = "机构名称" ,required=true)String name,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.queryBigscreenUser(name,securityContext);
    }
    
    @POST
    @Path("/queryAllBigscreen")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response queryAllBigscreen(@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.queryAllBigscreen(securityContext);
    }
    
    @POST
    @Path("/queryByID")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response queryByID(@ApiParam(value = "机构id" ,required=true)String guid,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.queryBigscreenUserByID(guid,securityContext);
    }
    
    @POST
    @Path("/updateTenant")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "修改机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "修改机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response updateTenant(@ApiParam(value = "参数" ,required=true)String perdate,@Context HttpServletRequest request)throws NotFoundException {
    	return delegate.updateTenant(perdate, request);
    }
    
    @POST
    @Path("/deleteTenant")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "修改机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "修改机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response deleteTenant(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.deleteTenant(perdate, securityContext);
    }
    
    
    @POST
    @Path("/changeOpenTenant")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "修改机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "修改机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response changeOpenTenant(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.changeOpenTenant(perdate, securityContext);
    }
    
    @POST
    @Path("/changeCloseTenant")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "修改机构", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "修改机构返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response changeCloseTenant(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.changeCloseTenant(perdate, securityContext);
    }
    
}
