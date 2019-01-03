package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.UserApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.LoginResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryServerUrlResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryUserListResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryXuantiByIdAndTypeResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.UserCondition;

import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;

@Path("/user")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    @Path("/getUserInfo")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "获取用户详情服务", response = LoginResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "获取用户详情结果返回", response = LoginResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = LoginResponse.class) })
    public Response getUserInfo(
        @ApiParam(value = "查询条件" ,required=true) UserCondition userCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserInfo(userCondition,securityContext);
    }
    @POST
    @Path("/login")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据查询条件获取资源列表", response = LoginResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = LoginResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = LoginResponse.class) })
    public Response login(
        @ApiParam(value = "登陆条件" ,required=true) UserCondition userCondition,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.login(userCondition,securityContext);
    }
    
    @GET
    @Path("/queryServerUrl")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据utype获取servereSettings的URL", response = QueryServerUrlResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "单个资源返回", response = QueryServerUrlResponse.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "返回异常", response = QueryServerUrlResponse.class) })
    public Response queryServerUrl(@ApiParam(value = "utype") @QueryParam("type") String type,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queryServerUrl(type,securityContext);
    }
}

