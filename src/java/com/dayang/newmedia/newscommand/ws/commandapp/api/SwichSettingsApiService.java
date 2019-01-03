package com.dayang.newmedia.newscommand.ws.commandapp.api;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-04T10:41:20.470Z")
public abstract class SwichSettingsApiService {
    public abstract Response querySwitchSettingValueByType(Integer switchType,SecurityContext securityContext) throws NotFoundException;
}
