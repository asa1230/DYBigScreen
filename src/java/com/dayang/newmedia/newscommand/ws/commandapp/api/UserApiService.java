package com.dayang.newmedia.newscommand.ws.commandapp.api;

import com.dayang.newmedia.newscommand.ws.commandapp.model.UserCondition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public abstract class UserApiService {
      public abstract Response getUserInfo(UserCondition userCondition,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response login(UserCondition userCondition,SecurityContext securityContext)
      throws NotFoundException;
	  public abstract Response queryServerUrl(String type, SecurityContext securityContext) throws NotFoundException;
}
