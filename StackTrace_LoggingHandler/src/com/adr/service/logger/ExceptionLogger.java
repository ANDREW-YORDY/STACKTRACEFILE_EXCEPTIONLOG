package com.adr.service.logger;


/**
 * Clase especializada en el registro de excepciones y su análisis.
 * Implementa diferentes niveles y formatos de logging.
 */
public class ExceptionLogger {

    public void logException(Exception e) {
        System.err.println("\n=== Excepción Detectada ===\n");
        System.err.println("Timestamp: " + System.currentTimeMillis());
        System.err.println("Tipo:      " + e.getClass().getName());
        System.err.println("Message:   " + e.getMessage());

    }
    
    public void logStackTraceAnalysis(String analysis)
    {
        System.out.println("\n" + analysis);
    }

}
