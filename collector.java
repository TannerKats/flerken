import java.util.Scanner;

public class collector {

    public static void main(String[]args) {
        

        // create empty array of length 5
        double num[] = new double[5];


        // user inputs 5 numbers 
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter a number: ");

            num[i] = scanner.nextDouble();
        }

        scanner.close();

        // calculate the average of all 5 numbers
        double average = (num[0] + num[1] + num[2] + num[3] + num[4])/num.length;


        // print the average results
        System.out.println("The average of the numbers you entered is: ");
        System.out.println(average);

    }
}
