package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryClueByIdApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryClueByIdApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueByIdApiServiceFactory {

   private final static QueryClueByIdApiService service = new QueryClueByIdApiServiceImpl();

   public static QueryClueByIdApiService getQueryClueByIdApi()
   {
      return service;
   }
}
