package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.SwichSettingsApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.SwichSettingsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public class SwichSettingsApiServiceFactory {
    private final static SwichSettingsApiService service = new SwichSettingsApiServiceImpl();

    public static SwichSettingsApiService getSwichSettingsApi() {
        return service;
    }
}
