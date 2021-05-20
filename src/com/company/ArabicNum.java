package com.company;
import java.util.Arrays;
public class ArabicNum {


public static int Rome(String input){
    int [] arab = new int[ ]{10,1,2,3,4,5,6,7,8,9};
    String[] rome = new String[]{"X","I","II","III","IV","V","VI","VII","VIII","IX"};
    for (int i = 0; i < rome.length;i++){
        if (rome[i].equals(input)){
            return arab[i];
        }
    }
    return 0;
}
    public static double calc(int num1, int num2, String operation){
        double result = 0;
        switch (operation){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = (double) num1/num2;
                break;
            default:
                System.out.println("ERROR. Санды туура бериниз!");break;

        }
        return result;
    }
}

