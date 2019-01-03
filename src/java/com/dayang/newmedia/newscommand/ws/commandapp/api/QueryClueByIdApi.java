package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryClueByIdApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryClueById")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryClueById API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueByIdApi  {
   private final QueryClueByIdApiService delegate = QueryClueByIdApiServiceFactory.getQueryClueByIdApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据资源ID查询线索详情", response = QueryClueByIdResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "资源查询返回", response = QueryClueByIdResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryClueByIdResponse.class) })
    public Response queryClueById(
        @ApiParam(value = "查询条件" ,required=true) QueryClueCondition queryClueCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryClueById(queryClueCondition,securityContext);
    }
}
