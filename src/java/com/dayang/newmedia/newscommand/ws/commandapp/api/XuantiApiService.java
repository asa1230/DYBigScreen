package com.dayang.newmedia.newscommand.ws.commandapp.api;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public abstract class XuantiApiService {
      public abstract Response queryXuantiById(String id,SecurityContext securityContext)
      throws NotFoundException;
}
