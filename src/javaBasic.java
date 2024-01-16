import java.util.Scanner;
public class javaBasic {
    public static void main(String[] args) {
        boolean checkContinue;
        do {
            checkContinue = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("Nhập 1. Tính lãi suất");
            System.out.println("Nhập 2. Tìm ước chung");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    excersizeGetTotalInterest();
                    break;
                case 2:
                    commonWish();
                    break;
            }
            System.out.println("Do you want to continue? (YES/NO)");
            String userChoice = scanner.next();
            checkContinue = userChoice.equalsIgnoreCase("YES");
        } while (checkContinue);
    }
    public static void commonWish(){
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");


        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
    public static void excersizeGetTotalInterest(){
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter investment amount: ");
        money = input.nextDouble();     // 5


        System.out.println("Enter number of months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();         // 5.5

        double total_interset = getTotalInterest(money, month, interset_rate);

        System.out.println("Total of interset: " + total_interset);
    }
    public static double getTotalInterest(double money, int month, double interset_rate) {
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;

        }
        return total_interset;
    }
}