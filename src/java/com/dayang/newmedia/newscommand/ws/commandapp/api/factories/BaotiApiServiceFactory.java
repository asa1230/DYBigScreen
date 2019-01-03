package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.BaotiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.BaotiApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class BaotiApiServiceFactory {

   private final static BaotiApiService service = new BaotiApiServiceImpl();

   public static BaotiApiService getBaotiApi()
   {
      return service;
   }
}
