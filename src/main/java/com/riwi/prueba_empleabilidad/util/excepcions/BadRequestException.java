package com.riwi.prueba_empleabilidad.util.excepcions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
