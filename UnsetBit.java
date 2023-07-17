package unsetBit;

import java.util.Scanner;

public class UnsetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        scanner.close();
        System.out.println(unset(number_1, number_2));
    }

    private static int unset(int number_1, int number_2) {
        return (number_1 & (1 << number_2));
    }

}
