package controller;

import model.Calculator;
import model.Operation;

public interface Controller {
    void createCalculator();

    Operation startOperation();

    void gettingData();

    String prompt(String message);
}
