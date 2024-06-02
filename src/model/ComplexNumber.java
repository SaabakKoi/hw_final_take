package model;

public class ComplexNumber {
    private final String num;

    public ComplexNumber(String num) {
        this.num = num;
    }

    public String[] getComNum(){
        String[] result = num.split("\\+");
        return result;
    }
}
