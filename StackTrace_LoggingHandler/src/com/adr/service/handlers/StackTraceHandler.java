package com.adr.service.handlers;

import java.util.stream.Collector;
import java.util.*;

/**
 * Manejador especializado en procesar y analizar el StackTrace. Implementa
 * métodos avanzados para extraer información útil del StackTrace.
 */
public class StackTraceHandler {


    public String getFormattedStackTrace(Exception e) {
        StringBuilder analysis = new StringBuilder();
        analysis.append("=== Análisis Detallado del StackTrace ===\n");

        // Información básica de la excepción
        analysis.append("Tipo de Exception: ").append(e.getClass().getName()).append("\n");
        analysis.append("          Mensaje: ").append(e.getMessage()).append("\n\n");

        // Análisis del StackTrace
        StackTraceElement[] stacktrace;
        stacktrace = e.getStackTrace();
        analysis.append("*Secuencia de llamadas (de más reciente a más antigua):\n\n ");

        for (int i = 0; i < stacktrace.length; i++) {
            StackTraceElement elem = stacktrace[i];
            analysis.append(String.format("%d. Clase: %s\n   Método: %s\n Línea: %d\n ",
                    i + 1,
                    elem.getClassName(),
                    elem.getMethodName(),
                    elem.getLineNumber()
            ));
        }

        return analysis.toString();
    }
    
    public String getRootCause(Exception e)    
    {
        Throwable rootCause = e;
        while ( rootCause.getCause() !=null ) 
        {
            rootCause = rootCause.getCause();
        }
        return rootCause.toString();
    }

}
