package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.XuantiApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdResponse;

import io.swagger.annotations.ApiParam;

@Path("/xuanti")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the xuanti API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class XuantiApi  {
   private final XuantiApiService delegate = XuantiApiServiceFactory.getXuantiApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据guid获取报题资源详情", response = QueryXuantiByIdResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "单个资源返回", response = QueryXuantiByIdResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryXuantiByIdResponse.class) })
    public Response queryXuantiById(
        @ApiParam(value = "根据选题ID获取选题详情",required=true) @PathParam("id") String id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryXuantiById(id,securityContext);
    }
}
