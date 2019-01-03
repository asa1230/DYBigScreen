package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryBaotiApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryBaotiResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryBaoti")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryBaoti API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryBaotiApi  {
   private final QueryBaotiApiService delegate = QueryBaotiApiServiceFactory.getQueryBaotiApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询报题资源", response = QueryBaotiResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "资源查询返回", response = QueryBaotiResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryBaotiResponse.class) })
    public Response queryBaoti(
        @ApiParam(value = "查询条件" ,required=true) QueryTaskCondition queryTaskCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryBaoti(queryTaskCondition,securityContext);
    }
}
