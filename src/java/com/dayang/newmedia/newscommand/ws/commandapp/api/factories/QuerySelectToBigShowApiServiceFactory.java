package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QuerySelectToBigShowApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QuerySelectToBigShowApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectToBigShowApiServiceFactory {
    private final static QuerySelectToBigShowApiService service = new QuerySelectToBigShowApiServiceImpl();

    public static QuerySelectToBigShowApiService getQuerySelectToBigShowApi() {
        return service;
    }
}
