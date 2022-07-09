package ru.javarush.cryptoanaliser.vovkotrub.controller;

import ru.javarush.cryptoanaliser.vovkotrub.commands.Action;
import ru.javarush.cryptoanaliser.vovkotrub.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        return action.execute(parameters);
    }
}
