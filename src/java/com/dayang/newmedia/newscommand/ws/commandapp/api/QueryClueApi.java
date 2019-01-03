package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryClueApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryHJCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryClue")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryClue API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueApi  {
   private final QueryClueApiService delegate = QueryClueApiServiceFactory.getQueryClueApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询线索资源", response = QueryClueResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "资源查询返回", response = QueryClueResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryClueResponse.class) })
    public Response queryClue(
        @ApiParam(value = "查询条件" ,required=true) QueryHJCondition queryHJCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryClue(queryHJCondition,securityContext);
    }
}
