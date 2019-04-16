package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBigscreenUserApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryBigscreenUserApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryBigscreenUserApiServiceFactory {
	private final static  QueryBigscreenUserApiService service = new QueryBigscreenUserApiServiceImpl();

    public static QueryBigscreenUserApiService getQueryBigscreenUserApi() {
        return service;
    }
}
