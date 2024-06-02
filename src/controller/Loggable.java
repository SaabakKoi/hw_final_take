package controller;

import model.Operation;

import java.util.Scanner;

public class Loggable implements Controller{

    private final Controller userController;

    public Loggable(Controller userController) {
        this.userController = userController;
    }

    @Override
    public void createCalculator() {
        System.out.println("...creating calculator...");
        userController.createCalculator();


    }

    @Override
    public Operation startOperation() {
        System.out.println("...choosing operation...");
        return userController.startOperation();
    }

    @Override
    public void gettingData() {
        System.out.println("...getting data...");
        userController.gettingData();
    }

    @Override
    public String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
