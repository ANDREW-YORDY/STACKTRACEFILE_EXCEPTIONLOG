package com.adr.app;

import com.adr.service.ExceptionHandlingControler;
import com.adr.service.logger.ExceptionLogger;


/**
 * Clase principal que inicia la aplicación.
 * Sigue el principio SRP al solo encargarse de la inicialización.
 */
public class AppRun {

    public static void main(String[] args) {

         // Inicializamos el controlador con sus dependencias
        ExceptionLogger logger = new ExceptionLogger();
        ExceptionHandlingControler ctr = new ExceptionHandlingControler(logger);
        // Ejecutamos el ejemplo de manejo de excepciones
        ctr.runException();

    }

}
