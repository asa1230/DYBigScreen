package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.SwichSettingsApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySwitchSettingValueByTypeResponse;

import io.swagger.annotations.ApiParam;

@Path("/swichSettings")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the swichSettings API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public class SwichSettingsApi  {
   private final SwichSettingsApiService delegate = SwichSettingsApiServiceFactory.getSwichSettingsApi();

    @GET
    @Path("/{switchType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "根据switchType类型从开关参数设置表中获取相关参数值", response = QuerySwitchSettingValueByTypeResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "开关参数值返回", response = QuerySwitchSettingValueByTypeResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QuerySwitchSettingValueByTypeResponse.class) })
    public Response querySwitchSettingValueByType(@ApiParam(value = "开关类型",required=true) @PathParam("switchType") Integer switchType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.querySwitchSettingValueByType(switchType,securityContext);
    }
}
