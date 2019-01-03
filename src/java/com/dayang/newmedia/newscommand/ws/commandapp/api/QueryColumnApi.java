package com.dayang.newmedia.newscommand.ws.commandapp.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryColumnApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryColumnResponse;

@Path("/queryColumn")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryColumn API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryColumnApi  {
   private final QueryColumnApiService delegate = QueryColumnApiServiceFactory.getQueryColumnApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询栏目", response = QueryColumnResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询栏目返回", response = QueryColumnResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryColumnResponse.class) })
    public Response queryColumn(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryColumn(securityContext);
    }
}
