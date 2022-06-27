package UsluSayi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int x;
        int result = 1;

        System.out.print("Ussu alinacak sayi -- n: ");
        n= input.nextInt();

        System.out.print("Us olacak sayi -- x: ");
        x= input.nextInt();

        for (int i = 1; i<=x; i++){

            result = result * n;

            System.out.println("sonuc: " + result);
        }
        System.out.println("sonuc: " + result);
    }
}
