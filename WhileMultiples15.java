import java.util.Scanner;
public class WhileMultiples15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, multiple, sum, counter;
        double avg;
        sum = 0;
        counter = 0;
        i = 1;
   

        System.out.print("Input the multiple : ");
        multiple = input.nextInt();
        
        while( i <= 50){
            if(i % multiple == 0){
                sum = sum + i;
                counter++;
            }
            i++;
    }
    avg = (double)sum / counter;
    System.out.println("Average of multiple : " + avg);
    
    System.err.printf("There are %f number that are multiple of %f in range 1 to 50. \n", counter, multiple);
    System.out.printf("The sum of all multiple of %f in range 1 to 50 is %f. \n", multiple, sum);
}
}
