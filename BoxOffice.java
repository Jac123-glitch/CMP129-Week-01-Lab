import java.util.Scanner;
public class BoxOffice {
public static void main(String [] args){

    
    double gross,net,distributor;
    int adultTickets,childTickets;
    String movie;

    Scanner keyboard = new Scanner(System.in);
    //Ask le user for movie name, child ticket amount and adult
    System.out.println("What is thew movie name?:");
    movie = keyboard.nextLine();
    System.out.println("number of adult tickets:");
    adultTickets = keyboard.nextInt();
    System.out.println("number of child tickets: ");
    childTickets = keyboard.nextInt();
    gross = (adultTickets * 10.00) + (childTickets * 6.00);
    net = gross * 0.20;
    distributor = gross - net;
    System.out.println("Movie Name:/t/t/t"+movie);
    System.out.println("Adult Tickets Sold:\t"+adultTickets);
    System.out.println("Child Tickets Sold:\t"+childTickets);
    System.out.println("Gross box Office Profit:\t$"+gross);
    System.out.println("Net Box Office Profit:\t$"+net);
    System.out.println("Amount Paid to Distributor:\t$"+distributor);



}
    
    
}
