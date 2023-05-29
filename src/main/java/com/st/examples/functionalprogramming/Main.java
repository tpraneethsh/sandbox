package com.st.examples.functionalprogramming;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> {
            System.out.println("Sending mail via Gmail");
            return true;
        };
        EmailSender hotmail = (from, to) -> {
            //logic
            //var isValid:: boolean = to.contains("@");
            //more logic
            System.out.println("Sending mail via Hotmail");
            return true;
        };

        gmail.send("gm@gmail.com","mail@mail.com");
        hotmail.send("hm@hmail.com","mail2@mail.com");
        }
}