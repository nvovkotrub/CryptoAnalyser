package ru.javarush.cryptoanaliser.vovkotrub;

import ru.javarush.cryptoanaliser.vovkotrub.toplevel.Application;
import ru.javarush.cryptoanaliser.vovkotrub.controller.MainController;
import ru.javarush.cryptoanaliser.vovkotrub.entity.Result;

public class Runner {

    public static void main(String[] args) {
        MainController mainController = new MainController();
        // encode text.txt encoded.txt 45
        Application application = new Application(mainController);
        Result result= application.run(args);
        System.out.println(result);
    }
}
