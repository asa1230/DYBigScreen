package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.BaotiApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiByIdResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/baoti")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the baoti API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class BaotiApi  {
   private final BaotiApiService delegate = BaotiApiServiceFactory.getBaotiApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据guid获取报题资源详情", response = QueryBaotiByIdResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "单个资源返回", response = QueryBaotiByIdResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBaotiByIdResponse.class) })
    public Response queryBaotiById(
        @ApiParam(value = "获取报题资源详情时需要传入资源Id",required=true) @PathParam("id") String id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryBaotiById(id,securityContext);
    }
}
