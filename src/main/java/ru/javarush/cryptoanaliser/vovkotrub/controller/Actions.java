package ru.javarush.cryptoanaliser.vovkotrub.controller;

import ru.javarush.cryptoanaliser.vovkotrub.commands.Action;
import ru.javarush.cryptoanaliser.vovkotrub.commands.Decoder;
import ru.javarush.cryptoanaliser.vovkotrub.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());
    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;
    }
}

