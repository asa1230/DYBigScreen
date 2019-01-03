package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public abstract class QueryMissionTypeApiService {
      public abstract Response queryMissionType(SecurityContext securityContext)
      throws NotFoundException;
}
