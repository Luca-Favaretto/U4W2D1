package it.epicode.be.exception;

public class DivZero extends ArithmeticException {


    public DivZero() {
        super("Non si può dividere per 0");
    }

}
