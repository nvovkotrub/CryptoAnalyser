package ru.javarush.cryptoanaliser.vovkotrub.constans;

public class Strings {
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphres = "1234567890";
    private static final String symbols = "~!@#$%^&*()_+ -<>?:{}[];'?\"|.,";
    public static final String ALPHABET = rus + rus.toUpperCase() + eng + eng.toUpperCase() + cyphres + symbols;

}
