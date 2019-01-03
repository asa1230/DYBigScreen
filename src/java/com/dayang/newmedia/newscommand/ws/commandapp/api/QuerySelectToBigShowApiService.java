package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public abstract class QuerySelectToBigShowApiService {
    public abstract Response querySelectToBigShow(String id,SecurityContext securityContext) throws NotFoundException;
}
