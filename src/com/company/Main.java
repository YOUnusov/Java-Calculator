package com.company;

import java.util.Scanner;

public class Main {



    private static String[] pars(String input) {
        String[] parsed_input = input.split(" ");
        if (parsed_input.length != 3) {
            Scanner input_a_value_again = new Scanner(System.in);
            input = input_a_value_again.nextLine();
            return pars(input);
        } else {
            return parsed_input;
        }
    }

    public static void main(String[] args) {
        boolean  its_an_arabic_numbers =true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ар бир санды болок туюнтманы жазыныз ...Мисалыга:2 + 2 же II + II: ");
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] parsed_input = Main.pars(input);
            String operation = parsed_input[1];
            Number values;
            int value1 = 0;
            int value2 = 0;

            try {
                value1 = Integer.parseInt(parsed_input[0]);
                value2 = Integer.parseInt(parsed_input[2]);

            } catch (NumberFormatException e) {
                its_an_arabic_numbers = false;
                System.out.println("Рим сандары берилген");

            }

            if (its_an_arabic_numbers) {
                System.out.println(ArabicNum.calc(value1,value2,operation));
                break;
            } else {
                System.out.println(RomeNum.toRomanNumeral((int) ArabicNum.calc(ArabicNum.Rome(parsed_input[0]),ArabicNum.Rome(parsed_input[2]),operation)));
                break;
            }
        }
    }
}
