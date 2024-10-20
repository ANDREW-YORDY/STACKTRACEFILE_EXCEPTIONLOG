package com.adr.app;

import com.adr.service.ExceptionHandlingControler;
import com.adr.service.logger.ExceptionLogger;

public class AppRun {

    public static void main(String[] args) {

        ExceptionLogger logger = new ExceptionLogger();
        ExceptionHandlingControler ctr = new ExceptionHandlingControler(logger);
        ctr.runException();

    }

}
