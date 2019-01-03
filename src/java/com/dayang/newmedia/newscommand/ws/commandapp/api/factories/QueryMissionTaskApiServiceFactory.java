package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryMissionTaskApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryMissionTaskApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryMissionTaskApiServiceFactory {

   private final static QueryMissionTaskApiService service = new QueryMissionTaskApiServiceImpl();

   public static QueryMissionTaskApiService getQueryMissionTaskApi()
   {
      return service;
   }
}
