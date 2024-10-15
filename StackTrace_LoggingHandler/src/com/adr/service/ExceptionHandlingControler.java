package com.adr.service;

import com.adr.service.ExceptionDetailsHandler;

public class ExceptionHandlingControler 
{
    
    public ExceptionDetailsHandler ctrDetll;
    
    public void runException()
    {
        try {
            induceError();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
    public void induceError() {
        int[] arr = {1, 2, 3, 4};
        System.err.println("Result!: " + arr[5]);
    }
    
}
