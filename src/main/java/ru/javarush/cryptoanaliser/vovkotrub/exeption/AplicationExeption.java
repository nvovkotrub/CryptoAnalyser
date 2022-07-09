package ru.javarush.cryptoanaliser.vovkotrub.exeption;

public class AplicationExeption extends RuntimeException{
    public AplicationExeption() {
        super();
    }

    public AplicationExeption(String message) {
        super(message);
    }

    public AplicationExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public AplicationExeption(Throwable cause) {
        super(cause);
    }
}
