import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Exercise hw2#1
// get 10 numbers from users and print sum of positive numbers only

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int counter = 0;
//        while (counter < 10) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            if (input_number > 0) {
//                sum += input_number;
//            }
//            counter++;
//        }
//        System.out.println("sum of positive numbers is: " + sum);


//Exercise hw2#
// get 10 numbers from users and print sum of positive numbers and sum of negative numbers

//        Scanner scanner = new Scanner(System.in);
//        int sum_pos = 0;
//        int sum_neg = 0;
//        int counter = 0;
//        while (counter < 10) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            if (input_number > 0) {
//                sum_pos += input_number;
//            } else if (input_number < 0) {
//                sum_neg += input_number;
//            }
//            counter++;
//        }
//        System.out.println("sum of positive numbers is: " + sum_pos);
//        System.out.println("sum of negative numbers is: " + sum_neg);

//Exercise hw2#3
//get 2 numbers and calculate power x^y

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter 2 numbers to calculate power x^y:");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int powerxy = 1;
//        for (int i = 0; i < y; i++) {
//            powerxy *= x;
//        }
//        System.out.println("The power of " + x + " to " + y + " is: " + powerxy);

//Exercise hw2#4
//Ask user to enter number and print reverse number
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number:");
        int input_number = scanner.nextInt();
        while (input_number > 10) {
            System.out.print(input_number % 10);
            input_number = input_number / 10;
        }
        System.out.print(input_number);

    }
}