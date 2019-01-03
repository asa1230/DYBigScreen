package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QuerySelectListToBigShowApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListCondition;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListToBigShowResponse;

import io.swagger.annotations.ApiParam;

@Path("/querySelectListToBigShow")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the querySelectList API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectListToBigShowApi  {
   private final QuerySelectListToBigShowApiService delegate = QuerySelectListToBigShowApiServiceFactory.getQuerySelectListToBigShowApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询选题列表", response = QuerySelectListToBigShowResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QuerySelectListToBigShowResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QuerySelectListToBigShowResponse.class) })
    public Response querySelectListToBigShow(@ApiParam(value = "请求参数" ,required=true) QuerySelectListCondition querySelectListCondition
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.querySelectListToBigShow(querySelectListCondition,securityContext);
    }
}
