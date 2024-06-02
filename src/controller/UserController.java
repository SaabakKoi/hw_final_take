package controller;

import model.*;
import util.Commands;

import java.util.Scanner;

public class UserController implements Controller{

    private Calculator calculator = new Calculator();
    @Override
    public void createCalculator() {
        System.out.println("You started using a calculator for complex numbers.");
    }

    @Override
    public Operation startOperation() {
        Commands type;
        type = Commands.valueOf(prompt("Choose operation: \n" + "SUM MUL DIV"));
        Operation operation = null;


        switch (type){
            case SUM:
                ComplexNumber point1 = new ComplexNumber(calculator.getPoint1());
                ComplexNumber point2 = new ComplexNumber(calculator.getPoint2());
                operation = new OperationSum();
                System.out.println(operation.operation(point1.getComNum(), point2.getComNum()));
            break;
            case MUL:
                ComplexNumber point3 = new ComplexNumber(calculator.getPoint1());
                ComplexNumber point4 = new ComplexNumber(calculator.getPoint2());
                operation = new OperationMul();
                System.out.println(operation.operation(point3.getComNum(), point4.getComNum()));
            break;
            case DIV:
                ComplexNumber point5 = new ComplexNumber(calculator.getPoint1());
                ComplexNumber point6 = new ComplexNumber(calculator.getPoint2());
                operation = new OperationDiv();
                System.out.println(operation.operation(point5.getComNum(), point6.getComNum()));
            break;
        }
        return operation;
    }

    @Override
    public void gettingData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first complex number\n"+"EXAMPLE: 1+5i; -4+56i; -554+34i ");
        String point1 = scanner.next();
        calculator.setPoint1(point1);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Now, please enter your second complex number");
        String point2 = scanner2.next();
        calculator.setPoint2(point2);
    }

    @Override
    public String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }


}
