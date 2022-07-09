package ru.javarush.cryptoanaliser.vovkotrub.commands;

import ru.javarush.cryptoanaliser.vovkotrub.entity.Result;
import ru.javarush.cryptoanaliser.vovkotrub.entity.ResultCode;
import ru.javarush.cryptoanaliser.vovkotrub.exeption.AplicationExeption;
import ru.javarush.cryptoanaliser.vovkotrub.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO need logic encrypt
        String txtFile = parameters[0];
        String encryptedFile = parameters[0];
        Path path = Path.of(PathFinder.getRoot() + txtFile);
        try {
            List<String> strings = Files.readAllLines(path);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new AplicationExeption("IO error", e);
        }
        return new Result(ResultCode.OK, "reed all bytes" + path);

    }
}
