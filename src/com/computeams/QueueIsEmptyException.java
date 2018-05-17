package com.computeams;

public class QueueIsEmptyException extends Throwable {

    public static final String MSG_FORMAT = "stack is empty";

    public String QueueIsEmptyException() {
        return MSG_FORMAT;
    }
}
