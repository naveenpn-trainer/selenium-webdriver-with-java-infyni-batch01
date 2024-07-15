package org.infyni.hands_on.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter numerator");
            int numerator = input.nextInt();

            System.out.println("Enter denominator");
            int denominator = input.nextInt();

            int quotient = numerator / denominator;
            System.out.println(quotient);
        }
       /* catch(ArithmeticException ex){
            System.out.println("Enter only numbers");
        }catch(InputMismatchException ex){
            System.out.println("Accepting only number "+ex.toString());
        }catch(Exception ex){
            System.out.println("global exception");
        }*/
      /* catch (ArithmeticException | InputMismatchException  e){
           if(e instanceof InputMismatchException){
               System.out.println("InputMisMatch Exception");
           } else if (e instanceof ArithmeticException) {
               System.out.println("Arithmetic Exception");
           }

        }*/
        catch (Exception  ex){
            if((InputMismatchException)ex instanceof InputMismatchException){
                System.out.println("InputMisMatch Exception");
            } else if ((ArithmeticException)ex instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception");
            }
        }
    }
}
