package com.dayang.newmedia.newscommand.ws.commandapp.api;

import io.swagger.model.*;
import io.swagger.annotations.ApiParam;
import com.sun.jersey.multipart.FormDataParam;
import java.util.List;
import java.io.InputStream;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.UsercolumnApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryUserListResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/usercolumn")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the usercolumn API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class UsercolumnApi  {
   private final UsercolumnApiService delegate = UsercolumnApiServiceFactory.getUsercolumnApi();

    @GET
    @Path("/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据guid获取报题资源详情", response = QueryUserListResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "查询该用户所在栏目下的所有用户", response = QueryUserListResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryUserListResponse.class) })
    public Response queryUserList(
        @ApiParam(value = "获取报题资源详情时需要传入资源Id",required=true) @PathParam("userId") String userId,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryUserList(userId,securityContext);
    }
}
