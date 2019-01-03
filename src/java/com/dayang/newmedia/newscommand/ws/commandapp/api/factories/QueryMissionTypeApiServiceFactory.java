package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryMissionTypeApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryMissionTypeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-16T01:30:07.527Z")
public class QueryMissionTypeApiServiceFactory {

   private final static QueryMissionTypeApiService service = new QueryMissionTypeApiServiceImpl();

   public static QueryMissionTypeApiService getQueryMissionTypeApi()
   {
      return service;
   }
}
