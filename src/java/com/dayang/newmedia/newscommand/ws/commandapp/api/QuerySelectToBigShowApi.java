package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QuerySelectToBigShowApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectTopicToBigShowResponse;

import io.swagger.annotations.ApiParam;

@Path("/querySelectToBigShow")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the querySelect API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-09T02:29:52.952Z")
public class QuerySelectToBigShowApi  {
   private final QuerySelectToBigShowApiService delegate = QuerySelectToBigShowApiServiceFactory.getQuerySelectToBigShowApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据选题ID获取选题详情", response = QuerySelectTopicToBigShowResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QuerySelectTopicToBigShowResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QuerySelectTopicToBigShowResponse.class) })
    public Response querySelectToBigShow(@ApiParam(value = "选题ID",required=true) @QueryParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.querySelectToBigShow(id,securityContext);
    }
}
