package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.annotations.ApiParam;
import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.QueryXuantiByIdAndTypeApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdAndTypeResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/queryXuantiByIdAndType")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the queryXuantiByIdAndType API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-11T08:12:33.541Z")
public class QueryXuantiByIdAndTypeApi  {
   private final QueryXuantiByIdAndTypeApiService delegate = QueryXuantiByIdAndTypeApiServiceFactory.getQueryXuantiByIdAndTypeApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据选题ID获取选题下面挂载的资源\\任务\\设备", response = QueryXuantiByIdAndTypeResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "单个资源返回", response = QueryXuantiByIdAndTypeResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "返回异常", response = QueryXuantiByIdAndTypeResponse.class) })
    public Response queryXuantiByIdAndType(
        @ApiParam(value = "根据选题ID删除选题",required=true) @QueryParam("id") String id,
        @ApiParam(value = "要获取选题下面的内容类型（0：挂载的资源、1：任务、2：设备）,默认是0") @QueryParam("type") String type,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryXuantiByIdAndType(id,type,securityContext);
    }
}
