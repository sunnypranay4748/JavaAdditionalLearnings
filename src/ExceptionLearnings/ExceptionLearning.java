package ExceptionLearnings;

import java.util.Scanner;

/*
Exception is an event that occurs during the execution of a program that disrupts
the normal flow of instructions

try block - To write the implementation
catch block- To catch the exception;
Finally block: This block will execute if try block execute or if catch block executes;

throw : throw will stop the execution of the code after executing the catch and finally block
 */

public class ExceptionLearning {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int a = scan.nextInt();

        System.out.println("Enter the second no: ");
        int b = scan.nextInt();

        try{
            int c= a/b;
            System.out.println("The result of the both numbers division is: "+ c);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
            throw e;
        }
        // finally block is optional
//        finally {
//            System.out.println("finally block");
//        }

    }
}
