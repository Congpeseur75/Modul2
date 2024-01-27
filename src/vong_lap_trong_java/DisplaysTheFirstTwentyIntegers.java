package vong_lap_trong_java;

import java.util.Scanner;
public class DisplaysTheFirstTwentyIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < number){
            if (isPrime(n)){
                System.out.print(n + "");
                count++;
            }
            n++;
        }
        input.close();
    }
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 0; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
