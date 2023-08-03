package com.st.examples.zulke;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
/*
* Codereview task given in Zulke interview
* */
//@Component
public class ItemService_copy {

    public static final Integer th = 20;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        validate(b);
    }

    static void validate(A a){

        eval(a);
    }
    private static void eval(A i) {
        System.out.println("eval A");
    }

    private static void eval(B sI) {
        System.out.println("eval B");
    }

/*    @Autowired
    private LogService l;

    private int vr;

    public int validate(Item i) {
        eval(i);
        log(i);
        return vr;
    }

    private void log(Item i) {
        l.begin();
        l.val(i, vr);
        l.end();
    }

    private void eval(Item i) {
        if (i.score() > th) {
            vr = 0;
        }
        vr = 1;
    }

    private void eval(SpecialItem sI) {
        if (sI.score() > th) {
            vr = 1;
        } else if (sI.score() == th) {
            vr = 2;
        }
        vr = 0;
    }*/
}