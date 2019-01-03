package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.model.*;
import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.MissionApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionByIdResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/mission")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the mission API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class MissionApi  {
   private final MissionApiService delegate = MissionApiServiceFactory.getMissionApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据guid获取报题资源详情", response = QueryMissionByIdResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "单个资源返回", response = QueryMissionByIdResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryMissionByIdResponse.class) })
    public Response queryMissionById(
        @ApiParam(value = "根据任务ID获取任务详情",required=true) @PathParam("id") String id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryMissionById(id,securityContext);
    }
}
