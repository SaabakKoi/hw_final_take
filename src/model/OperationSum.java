package model;

import model.Operation;

public class OperationSum implements Operation {
    public String operation(String[] point1, String[] point2){
        String[] result = new String[4];
        for (int i = 0; i < point1.length; i++) {
            int a = Integer.parseInt(point1[i].replaceAll("i",""));
            int b = Integer.parseInt(point2[i].replaceAll("i",""));
            int operation1 = a+b;
            result[i] = String.valueOf(operation1);
        }
        result[2] = result[1];
        result[1] = "+";
        result[3] = "i";
        return String.join("", result);
    }
}
