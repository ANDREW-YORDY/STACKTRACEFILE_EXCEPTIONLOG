package com.adr.service;

public class StackTraceHandler {

    public void getStackTrace(Exception e) {

        StringBuilder sb = new StringBuilder();
        for (StackTraceElement elem : e.getStackTrace()) {
            sb.append( elem.toString());
        }
    }

}
