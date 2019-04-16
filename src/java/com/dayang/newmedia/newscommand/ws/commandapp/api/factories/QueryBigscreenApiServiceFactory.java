package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryBigscreenApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryBigscreenApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryBigscreenApiServiceFactory {
	private final static  QueryBigscreenApiService service = new QueryBigscreenApiServiceImpl();

    public static QueryBigscreenApiService getQueryBigscreenApi() {
        return service;
    }
}
