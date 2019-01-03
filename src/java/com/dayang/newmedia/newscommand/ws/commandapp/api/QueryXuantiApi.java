package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryXuantiApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXTCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiResponse;

import io.swagger.annotations.ApiParam;

@Path("/queryXuanti")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryXuanti API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryXuantiApi  {
   private final QueryXuantiApiService delegate = QueryXuantiApiServiceFactory.getQueryXuantiApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询选题信息", response = QueryXuantiResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "资源查询返回", response = QueryXuantiResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryXuantiResponse.class) })
    public Response queryXuanti(
        @ApiParam(value = "查询条件" ,required=true) QueryXTCondition queryXTCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryXuanti(queryXTCondition,securityContext);
    }
}
