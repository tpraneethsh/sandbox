package com.st.examples.functionalprogramming;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
