package com.adr.service;

<<<<<<< HEAD
import com.adr.service.handlers.StackTraceHandler;
import com.adr.service.logger.ExceptionLogger;


/**
 * Controlador principal para la demostración de excepciones.
 * Coordina la generación y el manejo de excepciones.
 */
public class ExceptionHandlingControler {

    public ExceptionLogger   loggerCtr;
    public StackTraceHandler stackTraceHandler ;
    
    public ExceptionHandlingControler( ExceptionLogger ExcLogger )
    {
        loggerCtr = ExcLogger;
        this.stackTraceHandler = new StackTraceHandler();
    }

    public void runException() {
        try {
            induceNullPointerException();
        } catch (NullPointerException e) {
            // Procesamos la excepción de manera estructurada;
            processException(e);
=======
public class ExceptionHandlingControler 
{
    
    public ExceptionDetailsHandler ctrDetll;
    public StackTraceHandler       ctrStack;


    public void runException()
    {
        try {
            induceError();
        } catch (Exception e) {
            //e.printStackTrace();
            ctrStack.getStackTrace(e);
>>>>>>> 3647d268baa939fc442b5cd275b938d9f498ea09
        }
    }
    
    public void processException(Exception e)
    {
        // Registramos la excepción
        loggerCtr.logException(e);
        
        // Obtenemos y procesamos el StackTrace
        String stackTraceInfo = stackTraceHandler.getFormattedStackTrace(e);
        
        // Registramos el análisis del StackTrace
        loggerCtr.logStackTraceAnalysis(stackTraceInfo);
        
    }

    public void induceNullPointerException() 
    {
        String str = null;
        // Provocamos NPE intentando acceder a un método de un objeto null
        str.length();
    }

}
