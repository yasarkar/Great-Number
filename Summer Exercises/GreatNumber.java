import java.util.Scanner;

public class GreatNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");
        int number1 = input.nextInt();

        while (number1 < 0){

            System.out.print("Invalid input! \nPlease enter a positive number: ");
            number1 = input.nextInt();
        }

        int sumOfDivisors = 0;

        for (int counter = 1; number1 > counter; counter++){

            if (number1 % counter == 0){

                sumOfDivisors += counter;
            }
        }

        if (sumOfDivisors == number1){

            System.out.println("The number is Great Number!");
        }
 
        if (number1 == 1){

            System.out.println("The number is NOT Great Number!");
        }
        else {

            System.out.println("The number is NOT Great Number!");
        }
    }
}
