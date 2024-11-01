import java.util.Scanner;
public class DoWhileLeaveEntitlement15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();
        do{
            System.out.print("Do you want to take a leave (y/t)? ");
            confirmation = input.next();

            if(confirmation.equalsIgnoreCase("y")){
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if(numLeave > leaveEntitlement){
                    System.out.println("You only have leave entitlement for " + leaveEntitlement + " days");
                   
                }else{
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitilement: " + leaveEntitlement );
                }
            }else{
                break;
            }
        }  while(leaveEntitlement > 0);
    }
}
