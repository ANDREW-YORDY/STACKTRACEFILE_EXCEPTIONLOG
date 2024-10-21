package com.adr.service;

import com.adr.service.handlers.StackTraceHandler;
import com.adr.service.logger.ExceptionLogger;

/**
 * Controlador principal para la demostración de excepciones. Coordina la
 * generación y el manejo de excepciones.
 */
public class ExceptionHandlingControler {

    public ExceptionLogger loggerCtr;
    public StackTraceHandler stackTraceHandler;

    public ExceptionHandlingControler(ExceptionLogger ExcLogger) {
        loggerCtr = ExcLogger;
        this.stackTraceHandler = new StackTraceHandler();
    }

    public void runException() {
        try {
            induceNullPointerException();
        } catch (NullPointerException e) {
            // Procesamos la excepción de manera estructurada;
            processException(e);
        }
    }

    public void processException(Exception e) {
        // Registramos la excepción
        loggerCtr.logException(e);

        // Obtenemos y procesamos el StackTrace
        String stackTraceInfo = stackTraceHandler.getFormattedStackTrace(e);

        // Registramos el análisis del StackTrace
        loggerCtr.logStackTraceAnalysis(stackTraceInfo);

    }

    public void induceNullPointerException() {
        String str = null;
        // Provocamos NPE intentando acceder a un método de un objeto null
        str.length();
    }

}
