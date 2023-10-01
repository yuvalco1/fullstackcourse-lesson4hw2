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
//Example: 1234 -> 4321

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number:");
//        int input_number = scanner.nextInt();
//        while (input_number > 10) {
//            System.out.print(input_number % 10);
//            input_number = input_number / 10;
//        }
//        System.out.print(input_number);

//Exercise hw2#5

//        Scanner scanner = new Scanner(System.in);
//        int sum_odd = 0;
//        int sum_even = 0;
//        int counter = 1;
//        while (counter < 11) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            if (counter % 2 == 1) {
//                sum_odd += input_number;
//            } else {
//                sum_even += input_number;
//            }
//            counter++;
//        }
//        System.out.println("sum of numbers in odd position is: " + sum_odd);
//        System.out.println("sum of numbers in even position is: " + sum_even);

//Exercise hw2#6

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number n, to calculate sum of fraction 1+1/2+1/3+...+1/n:");
        int n = scanner.nextInt();
        double sum_fraction = 0;
        for (int i = 1; i <= n; i++) {
            sum_fraction += 1.0 / i;
        }
        System.out.println("sum of fraction 1+1/2+1/3+...+1/"+n+" is: " + sum_fraction);

    }
}