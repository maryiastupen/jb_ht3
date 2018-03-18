package com.epam.training.ht3.task3;

public class OutOfCalculatedIntervalException extends Throwable {

    public String message;

    public OutOfCalculatedIntervalException(String s) {
        this.message = s;
    }
}
