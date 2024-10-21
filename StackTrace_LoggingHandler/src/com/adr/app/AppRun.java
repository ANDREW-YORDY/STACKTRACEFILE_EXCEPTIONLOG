package com.adr.app;

import com.adr.service.ExceptionHandlingControler;
<<<<<<< HEAD
import com.adr.service.logger.ExceptionLogger;
=======
>>>>>>> 3647d268baa939fc442b5cd275b938d9f498ea09

public class AppRun {

    public static void main(String[] args) {

        ExceptionLogger logger = new ExceptionLogger();
        ExceptionHandlingControler ctr = new ExceptionHandlingControler(logger);
        ctr.runException();

    }

}
