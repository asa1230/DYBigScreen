package com.dayang.newmedia.newscommand.ws.commandapp.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryColumnResponse;
import com.sun.jersey.api.view.Viewable;

@Path("/logon")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the logon API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class LogonApi {

	@POST
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml" })
    public Viewable Logon(@Context HttpServletRequest request,@Context HttpServletResponse response) throws NotFoundException {
		
		return new Viewable("/view/nav/nav.html", null);
        
    }
	
}
