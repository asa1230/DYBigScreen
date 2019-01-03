package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryXuantiByIdAndTypeApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryXuantiByIdAndTypeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-11T08:12:33.541Z")
public class QueryXuantiByIdAndTypeApiServiceFactory {

   private final static QueryXuantiByIdAndTypeApiService service = new QueryXuantiByIdAndTypeApiServiceImpl();

   public static QueryXuantiByIdAndTypeApiService getQueryXuantiByIdAndTypeApi()
   {
      return service;
   }
}
