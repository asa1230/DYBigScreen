package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.model.*;
import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryMissionTypeApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionTypeResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryMissionType")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryMissionType API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class QueryMissionTypeApi  {
   private final QueryMissionTypeApiService delegate = QueryMissionTypeApiServiceFactory.getQueryMissionTypeApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询任务", response = QueryMissionTypeResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询任务返回", response = QueryMissionTypeResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryMissionTypeResponse.class) })
    public Response queryMissionType(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryMissionType(securityContext);
    }
}
