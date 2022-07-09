package ru.javarush.cryptoanaliser.vovkotrub.commands;

import ru.javarush.cryptoanaliser.vovkotrub.entity.Result;

public interface Action {
    Result execute(String[] parameters);

}
