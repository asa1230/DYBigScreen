package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryTaskCondition;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public abstract class QueryBaotiApiService {
      public abstract Response queryBaoti(QueryTaskCondition queryTaskCondition,SecurityContext securityContext)
      throws NotFoundException;
}
