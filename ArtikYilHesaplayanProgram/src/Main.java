import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int year;
        Scanner kb = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        year = kb.nextInt();

        if (year >= 0) {
            if (year%4 == 0) {
                if (year % 100 != 0) {
                    System.out.print(year + " Yılı bir artik yıldır.");
                } else if (year % 100 == 0 && year % 400 == 0) {
                    System.out.print(year + " Yılı bir artık yıldır.");
                } else {
                    System.out.print(year + " Yılı bir artık yil degildir.");
                }
            } else {
                System.out.print(year + " Yılı artık bir yıl degildir.");
            }
        } else {
            System.out.print("Gecersiz deger.");
        }
    }
}