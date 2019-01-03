package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.model.QuerySelectListCondition;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public abstract class QuerySelectListToBigShowApiService {
    public abstract Response querySelectListToBigShow(QuerySelectListCondition querySelectListCondition,SecurityContext securityContext) throws NotFoundException;
}
