package ru.javarush.cryptoanaliser.vovkotrub;

import ru.javarush.cryptoanaliser.vovkotrub.app.Application;
import ru.javarush.cryptoanaliser.vovkotrub.controller.MainController;

public class Runner {

    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result= application.run(args);
        System.out.println(result);
    }
}
