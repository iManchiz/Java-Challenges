package JavaChallenges;

import java.util.Scanner;
import java.lang.Math;

public class Challenge15_ArmstrongNumber {
    public static void main(String[] args) {

        System.out.print("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = {number};
        armstrongNumber(array);

    }

    private static int armstrongNumber (int[] array){
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0]);
        }

        return 0;

    }
}
