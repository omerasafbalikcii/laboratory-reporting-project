package com.lab.backend.patient.utilities.exceptions;

/**
 * Exception thrown when an invalid TR ID number is encountered.
 *
 * @author Ömer Asaf BALIKÇI
 */

public class InvalidTrIdNumberException extends RuntimeException {
    public InvalidTrIdNumberException(String message) {
        super(message);
    }
}
