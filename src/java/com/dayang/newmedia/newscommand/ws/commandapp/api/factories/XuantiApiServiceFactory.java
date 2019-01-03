package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.XuantiApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.XuantiApiServiceImpl;

public class XuantiApiServiceFactory {

   private final static XuantiApiService service = new XuantiApiServiceImpl();

   public static XuantiApiService getXuantiApi()
   {
      return service;
   }
}
