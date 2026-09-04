import java.util.Scanner;
public class InterestEarned {
public static void main(String [] args){

    double principle,interestR;
    int compounded;

    Scanner keyboard = new Scanner(System.in);
    //input/output 
    System.out.println("What is the principle amount?:");
    principle = keyboard.nextDouble();
    System.out.println("What is the annual interest rate?:");
    interestR = keyboard.nextDouble();
    System.out.println("What is the number of times interest is compounded during the year?:");
    compounded = keyboard.nextInt();
    //math
    double rate = interestR/100;
    double Amount = principle*Math.pow(1+(rate/compounded),compounded);
    double interest = Amount - principle;

    //print statement
    System.out.printf("Interest Rate:\t\t%.2f%%\n",interestR);
    System.out.println("Times Compounded:\t"+compounded);
    System.out.printf("Principal::\t$%.2f\n",principle);
    System.out.printf("Interest Earned: \t$%.2f\n", interest);
    System.out.printf("Amount in Savings:\t$%.2f\n",Amount);




    





    
}
} 
