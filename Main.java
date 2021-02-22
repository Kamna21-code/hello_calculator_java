package com.code;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num_1, num_2;

        System.out.println("Enter first number");
        Scanner scan = new Scanner(System.in);

        num_1 = scan.nextFloat();
        System.out.println("Enter second number");

        Scanner scan2 = new Scanner(System.in);
        num_2 = scan2.nextFloat();
        System.out.print("You entered ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.println(num_2);

        String prompt = "Enter 0 for addition, 1 for subtraction, " +
                         "2 for multiplication and 3 for divison";
        System.out.println(prompt);

        Scanner scan3 = new Scanner(System.in);
        int input = scan3.nextInt();
        System.out.println(input);

        switch(input) {
            case 0:
                System.out.println("Adding these numbers");
                System.out.print(" The result is: ");
                System.out.println(num_1 + num_2);
                break;
            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print(" The result is: ");
                System.out.println(num_1 - num_2);
                break;
            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print(" The result is: ");
                System.out.println(num_1 * num_2);
                break;
            case 3:
                System.out.println("Dividing these numbers");
                System.out.print(" The result is: ");
                System.out.print(num_1/num_2);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}