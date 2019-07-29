package com.myitzar.presentation.rest;

import com.myitzar.presentation.service.PNCPresentationService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/PNCRestService")
public class PNCPresentationServiceRestImpl implements PNCPresentationService {

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/ping")
    public String ping() {
        return "We're alive! " + new Date() + " ! Hello World";
    }

    @Override
    public String saveNotifyEmail() {
        return null;
    }
}
