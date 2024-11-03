import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String buy;
        int ticketSale, ticketPrice;
        ticketPrice = 50000;
        double ticketSold;
        ticketSold = 0;
        ticketSale = 0;

        System.out.print("Do you want to buy a ticket (y/n) ?  ");
        buy = input.nextLine();
        
        while (buy.equalsIgnoreCase("y")) {
            System.out.print("Enter the number ticket you want to buy (-1 to quit): ");
            int ticket = input.nextInt();
            double currentSale = ticket * ticketPrice;
            if (ticket == -1 ) {
                break;
            }else if(ticket > 10){
                ticketSale += ticket;
                currentSale *= 0.85;
                System.out.println("Buying " + ticket + " Tickets");
            }else if(ticket > 4){
                ticketSale += ticket;
                currentSale *= 0.90;
                System.out.println("Buying " + ticket + " Tickets");
            }else if(ticket < 0){
                System.out.println("Enter your ticket correctly");
                continue;
            }else{
                System.out.println("Buying " + ticket + " Tickets");
                ticketSale += ticket;
                currentSale *= 1;
            }
            ticketSold += currentSale; 
        }
        System.out.println("Total of ticket sale : " + ticketSale + " Tickets");
        System.out.println("Total ticket sold : " + ticketSold);
        
    }
}
