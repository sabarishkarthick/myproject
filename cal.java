package com.sabu;

import java.util.Scanner;

public class cal
{
    public static void main(String[] args) {
        char operator;
        double number1, number2,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a operator: +,-,* or / ");
        operator = input.next().charAt(0);
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Enter second number");
        number2 = input.nextDouble();
       if ((operator== '*') || (operator== '/')){

            if ((number1 == 0) || (number2 == 0)) {
                if (number1 == 0) {
                    System.out.println("enter number1 correctly");
                    number1 = input.nextDouble();
                } else {
                    System.out.println("enter number2 correctly");
                    number2 = input.nextDouble();
                }
            }
        }


            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + "+" + number2 + "=" + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + "-" + number2 + "=" + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + "*" + number2 + "= " + result);
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + "/" + number2 + "=" + result);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        input.close();

    }

}
