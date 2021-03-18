package com.banismo.certificacion.screenplay.exeptions;

public class GeneralException extends AssertionError{

    public GeneralException(String message, Throwable cause){
        super(message, cause);
    }
}
