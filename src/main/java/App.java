import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //input
        System.out.print("What is the first number? ");
        int value1= sc.nextInt();
        System.out.print("What is the second number? ");
        int value2= sc.nextInt();

        //addition
        System.out.print(value1+" + "+value2+" = ");
        System.out.println(value1+value2);
        //subtraction
        System.out.print(value1+" - "+value2+" = ");
        System.out.println(value1-value2);
        //multiplication
        System.out.print(value1+" * "+value2+" = ");
        System.out.println(value1*value2);
        //division
        System.out.print(value1+" / "+value2+" = ");
        System.out.println(value1/value2);
    }
}
