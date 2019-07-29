package com.myitzar.presentation.soap;

import com.myitzar.presentation.service.PNCPresentationService;

import java.util.Date;

public class PNCPresentationServiceSoapImpl implements PNCPresentationService {

    @Override
    public String ping() {
        return "We're alive! " + new Date() + " ! Hello World";
    }

    @Override
    public String saveNotifyEmail() {
        return null;
    }
}
