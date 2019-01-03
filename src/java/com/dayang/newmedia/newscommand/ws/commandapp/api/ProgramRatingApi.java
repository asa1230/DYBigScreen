package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.db.model.Programrating;
import com.dayang.newmedia.newscommand.ws.commandapp.api.factories.ProgramRatingApiServiceFactory;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryProgramRatingResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListCondition;

import io.swagger.annotations.ApiParam;

@Path("/queryProgramRatingShow")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the querySelectList API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class ProgramRatingApi {
   private final ProgramRatingApiService delegate = ProgramRatingApiServiceFactory.getQuerySelectListToBigShowApi();
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询选题列表", response = QueryProgramRatingResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QueryProgramRatingResponse.class),
    											  @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryProgramRatingResponse.class) })
    public Response querySelectListToBigShow(@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.queryProgramRating(securityContext);
    }
    
    
    @POST
    @Path("/queryAll")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "查询所有统计列表", response = QueryProgramRatingResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QueryProgramRatingResponse.class),
    											  @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryProgramRatingResponse.class) })
    public Response queryProgramRating(@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.queryAll(securityContext);
    }
    
    
    @POST
    @Path("/addOrUpdate")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "新增或修改统计数据", response = QueryProgramRatingResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QueryProgramRatingResponse.class),
    											  @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryProgramRatingResponse.class) })
    public Response addOrUpdate( @ApiParam(value = "收视统计" ,required=true) Programrating programRating,@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.addOrUpdate(programRating,securityContext);
    }
    
    @POST
    @Path("/deleteProgramRating")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "删除统计数据", response = QueryProgramRatingResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "登陆返回结果", response = QueryProgramRatingResponse.class),
    											  @io.swagger.annotations.ApiResponse(code = 200, message = "异常返回", response = QueryProgramRatingResponse.class) })
    public Response deleteProgramRating(@ApiParam(value = "收视统计" ,required=true)String ids,@Context SecurityContext securityContext) throws NotFoundException {
        return delegate.deleteProgramRating(ids,securityContext);
    }
}