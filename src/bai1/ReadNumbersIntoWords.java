package bai1;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số cần đọc
        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();

        // Bước 2: Đọc số có một chữ số
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }
        // Bước 3: Đọc số có hai chữ số nhỏ hơn 20
        else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        // Bước 4: Đọc số có hai chữ số lớn hơn hoặc bằng 20 và nhỏ hơn 100
        else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;

            String tensString = "";
            String onesString = "";

            switch (tens) {
                case 2:
                    tensString = "Twenty";
                    break;
                case 3:
                    tensString = "Thirty";
                    break;
                case 4:
                    tensString = "Forty";
                    break;
                case 5:
                    tensString = "Fifty";
                    break;
                case 6:
                    tensString = "Sixty";
                    break;
                case 7:
                    tensString = "Seventy";
                    break;
                case 8:
                    tensString = "Eighty";
                    break;
                case 9:
                    tensString = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    onesString = "One";
                    break;
                case 2:
                    onesString = "Two";
                    break;
                case 3:
                    onesString = "Three";
                    break;
                case 4:
                    onesString = "Four";
                    break;
                case 5:
                    onesString = "Five";
                    break;
                case 6:
                    onesString = "Six";
                    break;
                case 7:
                    onesString = "Seven";
                    break;
                case 8:
                    onesString = "Eight";
                    break;
                case 9:
                    onesString = "Nine";
                    break;
            }

            if (ones == 0) {
                System.out.println(tensString);
            } else {
                System.out.println(tensString + " " + onesString);
            }
        }
        // Bước 5: Đọc số có ba chữ số
        else if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            int remaining = number % 100;

            String hundredsString = "";
            String remainingString = "";

            switch (hundreds) {
                case 1:
                    hundredsString = "One Hundred";
                    break;
                case 2:
                    hundredsString = "Two Hundred";
                    break;
                case 3:
                    hundredsString = "Three Hundred";
                    break;
                case 4:
                    hundredsString = "Four Hundred";
                    break;
                case 5:
                    hundredsString = "Five Hundred";
                    break;
                case 6:
                    hundredsString = "Six Hundred";
                    break;
                case 7:
                    hundredsString = "Seven Hundred";
                    break;
                case 8:
                    hundredsString = "Eight Hundred";
                    break;
                case 9:
                    hundredsString = "Nine Hundred";
                    break;
            }

            // Đọc phần còn lại của số (remaining)
            if (remaining >= 10 && remaining < 20) {
                int ones = remaining % 10;
                switch (ones) {
                    case 0:
                        remainingString = "Ten";
                        break;
                    case 1:
                        remainingString = "Eleven";
                        break;
                    case 2:
                        remainingString = "Twelve";
                        break;
                    case 3:
                        remainingString = "Thirteen";
                        break;
                    case 4:
                        remainingString = "Fourteen";
                        break;
                    case 5:
                        remainingString = "Fifteen";
                        break;
                    case 6:
                        remainingString = "Sixteen";
                        break;
                    case 7:
                        remainingString = "Seventeen";
                        break;
                    case 8:
                        remainingString = "Eighteen";
                        break;
                    case 9:
                        remainingString = "Nineteen";
                        break;
                }
            } else if (remaining >= 20 && remaining <= 99) {
                int tens = remaining / 10;
                int ones = remaining % 10;

                String tensString = "";
                String onesString = "";

                switch (tens) {
                    case 2:
                        tensString = "Twenty";
                        break;
                    case 3:
                        tensString = "Thirty";
                        break;
                    case 4:
                        tensString = "Forty";
                        break;
                    case 5:
                        tensString = "Fifty";
                        break;
                    case 6:
                        tensString = "Sixty";
                        break;
                    case 7:
                        tensString = "Seventy";
                        break;
                    case 8:
                        tensString = "Eighty";
                        break;
                    case 9:
                        tensString = "Ninety";
                        break;
                }

                switch (ones) {
                    case 1:
                        onesString = "One";
                        break;
                    case 2:
                        onesString = "Two";
                        break;
                    case 3:
                        onesString = "Three";
                        break;
                    case 4:
                        onesString = "Four";
                        break;
                    case 5:
                        onesString = "Five";
                        break;
                    case 6:
                        onesString = "Six";
                        break;
                    case 7:
                        onesString = "Seven";
                        break;
                    case 8:
                        onesString = "Eight";
                        break;
                    case 9:
                        onesString = "Nine";
                        break;
                }

                if (ones == 0) {
                    System.out.println(hundredsString + " " + tensString);
                } else {
                    System.out.println(hundredsString + " " + tensString + " " + onesString);
                }
            }
        }
    }
}