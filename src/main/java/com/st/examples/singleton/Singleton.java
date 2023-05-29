package com.st.examples.singleton;


/**
 * Source: https://refactoring.guru/design-patterns/singleton/java/example#example-0
 * https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
 */

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        //The following code will emulate slow initialization
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }


}
