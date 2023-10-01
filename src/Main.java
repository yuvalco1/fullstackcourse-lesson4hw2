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
        Scanner scanner = new Scanner(System.in);
        int sum_pos = 0;
        int sum_neg = 0;
        int counter = 0;
        while (counter < 10) {
            System.out.println("please enter number:");
            int input_number = scanner.nextInt();
            if (input_number > 0) {
                sum_pos += input_number;
            } else if (input_number < 0) {
                sum_neg += input_number;
            }
            counter++;
        }
        System.out.println("sum of positive numbers is: " + sum_pos);
        System.out.println("sum of negative numbers is: " + sum_neg);

    }
}