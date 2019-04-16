package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryBigscreenApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBigscreenResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBigscreenUserResponse;

import io.swagger.annotations.ApiParam;

@Path("/queryBigscreen")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryBigscreen API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryBigscreenApi {

	private final QueryBigscreenApiService delegate = QueryBigscreenApiServiceFactory.getQueryBigscreenApi();

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询大屏", response = QueryBigscreenResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询大屏返回", response = QueryBigscreenResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenResponse.class) })
    public Response queryColumn(@Context HttpServletRequest request)
    throws NotFoundException {
        return delegate.queryBigscreen(request);
    }
    
    @POST
    @Path("/queryOtherBigscreen")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询大屏", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询大屏返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response queryOtherBigscreen(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.queryOtherBigscreen(perdate, securityContext);
    }
    
    @POST
    @Path("/addBigscreen")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "添加大屏", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "添加大屏返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response addBigscreen(@ApiParam(value = "参数" ,required=true)String perdate,@Context HttpServletRequest request)throws NotFoundException {
    	return delegate.addBigscreen(perdate, request);
    }
    
    @POST
    @Path("/updateBigscreen")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "更新大屏", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "更新大屏返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response updateBigscreen(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.updateBigscreen(perdate, securityContext);
    }
    
    @POST
    @Path("/deleteBigscreen")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "删除大屏", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "删除大屏返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response deleteBigscreen(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.deleteBigscreen(perdate, securityContext);
    }
    
    @POST
    @Path("/queryOtherBigscreenByID")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询大屏", response = QueryBigscreenUserResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询大屏返回", response = QueryBigscreenUserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBigscreenUserResponse.class) })
    public Response queryOtherBigscreenByID(@ApiParam(value = "参数" ,required=true)String perdate,@Context SecurityContext securityContext)throws NotFoundException {
    	return delegate.queryOtherBigscreenByID(perdate, securityContext);
    }
}
