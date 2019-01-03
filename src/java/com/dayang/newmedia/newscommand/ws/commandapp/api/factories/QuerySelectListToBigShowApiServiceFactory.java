package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.QuerySelectListToBigShowApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.QuerySelectListToBigShowApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class QuerySelectListToBigShowApiServiceFactory {
    private final static QuerySelectListToBigShowApiService service = new QuerySelectListToBigShowApiServiceImpl();

    public static QuerySelectListToBigShowApiService getQuerySelectListToBigShowApi() {
        return service;
    }
}
