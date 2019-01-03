package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryClueApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryClueApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueApiServiceFactory {

   private final static QueryClueApiService service = new QueryClueApiServiceImpl();

   public static QueryClueApiService getQueryClueApi()
   {
      return service;
   }
}
