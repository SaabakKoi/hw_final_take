package model;

import model.Operation;

public class OperationDiv implements Operation {

    public String operation(String[] point1, String[] point2) {
        int a = Integer.parseInt(point1[0]);
        int b = Integer.parseInt(point1[1].replaceAll("i",""));
        int c = Integer.parseInt(point2[0]);
        int d = Integer.parseInt(point2[1].replaceAll("i",""));
        int ac = a*c;
        int bd = b*d;
        int cc = c*c;
        int dd = d*d;
        int bc = b*c;
        int ad = a*d;
        Double result1 = (double) (ac+bd);
        Double result2 = (double) (cc+dd);
        Double result3 = (double) (bc-ad);
        Double result4 = result2;
        String[] finish = new String[4];
        finish[0] = String.format("%.3f", result1/result2);
        finish[1] = "+";
        finish[2]= String.format("%.3f", result3/result4);
        finish[3] = "i";
        return String.join("", finish);
    }
}
