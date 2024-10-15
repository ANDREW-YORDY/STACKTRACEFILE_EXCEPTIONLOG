package com.adr.service;

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
        }
    }
    
    public void induceError() {
        int[] arr = {1, 2, 3, 4};
        System.err.println("Result!: " + arr[5]);
    }
    
}
