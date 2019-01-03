package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.MissionApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.MissionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class MissionApiServiceFactory {

   private final static MissionApiService service = new MissionApiServiceImpl();

   public static MissionApiService getMissionApi()
   {
      return service;
   }
}
