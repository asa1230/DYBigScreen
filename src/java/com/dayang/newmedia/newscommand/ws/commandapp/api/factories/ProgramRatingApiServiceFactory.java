package com.dayang.newmedia.newscommand.ws.commandapp.api.factories;

import com.dayang.newmedia.newscommand.ws.commandapp.api.ProgramRatingApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.impl.ProgramRatingApiServiceImp;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-03T05:45:26.984Z")
public class ProgramRatingApiServiceFactory {
    private final static ProgramRatingApiService service = new ProgramRatingApiServiceImp();

    public static ProgramRatingApiService getQuerySelectListToBigShowApi() {
        return service;
    }

}
