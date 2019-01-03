package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryColumnApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QueryColumnApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryColumnApiServiceFactory {
    private final static QueryColumnApiService service = new QueryColumnApiServiceImpl();

    public static QueryColumnApiService getQueryColumnApi() {
        return service;
    }
}
