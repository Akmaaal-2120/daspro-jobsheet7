import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        String s = "";
   
        System.out.print("Input some number : ");
        numInput = input.nextInt();
    
        while (numInput > 0) {
            int i = 0;
            while (i < numInput) {
                s = " *";
                System.out.print(s);
                i++;
            }
            System.out.println();
            numInput--;
        }
    }
}
