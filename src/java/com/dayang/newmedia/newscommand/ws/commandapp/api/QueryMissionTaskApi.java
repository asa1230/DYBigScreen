package com.dayang.newmedia.newscommand.ws.commandapp.api;
import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryMissionTaskApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryMissionTaskResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryMissionTask")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryMissionTask API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryMissionTaskApi  {
   private final QueryMissionTaskApiService delegate = QueryMissionTaskApiServiceFactory.getQueryMissionTaskApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询任务", response = QueryMissionTaskResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询任务返回", response = QueryMissionTaskResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryMissionTaskResponse.class) })
    public Response queryMissionTask(
        @ApiParam(value = "查询条件" ,required=true) QueryTaskCondition queryTaskCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryMissionTask(queryTaskCondition,securityContext);
    }
}
