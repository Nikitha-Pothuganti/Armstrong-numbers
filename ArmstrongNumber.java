import java.util.Scanner;

public class ArmstrongNumber {

    // check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int sum = 0, originalNumber = number;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
    // Function 
    public static void printArmstrongNumbers(int start, int end) {
        System.out.print("Armstrong numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        printArmstrongNumbers(start, end);
        scanner.close();
        }
    }
}

