package model;

import model.Operation;

public class OperationMul implements Operation {

    public String operation(String[] point1, String[] point2){
        int a = Integer.parseInt(point1[0]);
        int b = Integer.parseInt(point1[1].replaceAll("i",""));
        int c = Integer.parseInt(point2[0]);
        int d = Integer.parseInt(point2[1].replaceAll("i",""));
        int ac = a*c;
        int bd = b*d;
        int ad = a*d;
        int bc = b*c;
        String[] s = new String[4];
        s[0]=String.valueOf(ac-bd);
        s[1] = "+";
        s[2] = String.valueOf(ad+bc);
        s[3] = "i";
        return String.join("", s);
    }

}
