package levelOneBeginner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public static long calculate(int n){
        long fact = 1;
        for (int i = 1; i <=n; i++) {
            fact *=i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("======================");
        System.out.println(" |    Factorial      | "); 
        System.out.println("======================");
        boolean keepRunning = true;

        while (keepRunning) {
             try {
            System.out.print("Enter number: ");
            int n = scan.nextInt();
            if(n<0){
                
                throw new IllegalArgumentException("Enter positive numbers only");

            }
            long fact = calculate(n);
            System.out.println("Factorial of "+n+" is: "+fact);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input please enter positive integer only");
        }catch(IllegalArgumentException e ){
            System.out.println("Error: "+e.getMessage());

        }
            System.out.println("Do you want's to calculate another factorial (y/n)");
            char choice = scan.next().toLowerCase().charAt(0);
            if (choice =='n') {
                keepRunning = false;
            }  
        }
        System.out.println("Thanks for using ");

       
        scan.close();
    }
    
}
