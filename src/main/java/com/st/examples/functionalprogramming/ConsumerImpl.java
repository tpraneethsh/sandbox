package com.st.examples.functionalprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerImpl {

    static String correctEmailId = "praneeth@mail.com";
    static String wrongEmailId = "praneethmail.com";

    public static void main(String[] args) {
        List<String> emailList = List.of("a@a.com", "b@b.com", "c@c.com", "d@d.com");

        //sendEmailConsumer.accept(correctEmailId);
        emailList.forEach(email -> sendEmailConsumer.accept(email));
       emailList.forEach(ConsumerImpl::sendEmail);

        //sendEmailFromTo.accept("a@a.com", "b@b.com");

    }

    static Consumer<String> sendEmailConsumer = email -> System.out.println("Sending email to " + email);
    static BiConsumer<String, String> sendEmailFromTo = (from, to) -> System.out.println("sending Email from %s, to %s ".formatted(from, to));

    static void sendEmail(String emailId) {
        System.out.println("Sending email to " + emailId);
    }

}


/**
 * Consumer Declaration
 * static Consumer<String> sendEmailConsumer = email -> System.out.println("Sending email to "+email);
 * <p>
 * Calling consumer
 * sendEmailConsumer.accept(correctEmailId);
 */