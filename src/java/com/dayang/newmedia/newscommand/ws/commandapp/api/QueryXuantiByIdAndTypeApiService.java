package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-11T08:12:33.541Z")
public abstract class QueryXuantiByIdAndTypeApiService {
      public abstract Response queryXuantiByIdAndType(String id,String type,SecurityContext securityContext)
      throws NotFoundException;
}
