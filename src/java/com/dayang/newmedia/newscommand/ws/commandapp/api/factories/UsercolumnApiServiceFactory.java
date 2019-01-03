package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.UsercolumnApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.UsercolumnApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class UsercolumnApiServiceFactory {

   private final static UsercolumnApiService service = new UsercolumnApiServiceImpl();

   public static UsercolumnApiService getUsercolumnApi()
   {
      return service;
   }
}
