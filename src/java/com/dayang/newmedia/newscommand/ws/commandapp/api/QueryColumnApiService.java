package com.dayang.newmedia.newscommand.ws.commandapp.api;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public abstract class QueryColumnApiService {
    public abstract Response queryColumn(SecurityContext securityContext) throws NotFoundException;
}
