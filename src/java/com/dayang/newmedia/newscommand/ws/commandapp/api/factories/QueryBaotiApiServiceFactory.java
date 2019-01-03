package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBaotiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryBaotiApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryBaotiApiServiceFactory {

   private final static QueryBaotiApiService service = new QueryBaotiApiServiceImpl();

   public static QueryBaotiApiService getQueryBaotiApi()
   {
      return service;
   }
}
