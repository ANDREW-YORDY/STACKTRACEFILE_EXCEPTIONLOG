package com.adr.app;

import com.adr.service.ExceptionHandlingControler;
import static java.lang.String.valueOf;

public class AppRun {

    public static void main(String[] args) {

        ExceptionHandlingControler ctr = new ExceptionHandlingControler();
        ctr.runException();

    }

}
