import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı Girin: ");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i) {
                System.out.println(i);
                total +=i
                ;
            }
        }
        System.out.println("\n Çarpanların Toplamı: " + total);
        if (total == number){
            System.out.println("\n" + number + " Mükemmel sayıdır.");
        }else{
            System.out.println("\n" + number + " Mükemmel Sayı Değildir.");
        }

        System.out.println("~~~~~~~~~~~~~~~~cherain~~~~~~~~~~~~~~");
    }
}