package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryXuantiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryXuantiApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryXuantiApiServiceFactory {

   private final static QueryXuantiApiService service = new QueryXuantiApiServiceImpl();

   public static QueryXuantiApiService getQueryXuantiApi()
   {
      return service;
   }
}
