import java.util.Scanner;
import java.util.SortedMap;

public class Faktoriyel {

    public static void main(String[] args) {

        //Faktöriyel Hesaplama

        // n!= 1*2*3*4*5*6*7....n

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Değer giriniz: ");
        n = scan.nextInt();

        int total = 1;

        for (int i = 1; i <= n; i++) {

            total = total * i;
        }
        System.out.println(n + ".Faktöriyel Sonucu: " + total);

        System.out.println("-----------------");


        /*
        KOMBİNASYON HESAPLAMA

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */

        Scanner scanner = new Scanner(System.in);

        int n1, r1, toplam = 1, toplam1 = 1, toplam2 = 1, kombinasyon = 1;

        System.out.print("n değerini giriniz: ");
        n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {

            toplam = toplam * i;
        }
        System.out.println(n + ".Faktöriyel n Değeri: " + toplam);
        System.out.println("--------");


        System.out.print("r değerini giriniz: ");
        r1 = scanner.nextInt();

        for (int i = 1; i <= r1; i++) {

            toplam1 = toplam1 * i;
        }
        System.out.println(r1 + ".Faktöriyel r Değeri: " + toplam1);
        System.out.println("--------");


        for (int i = 1; i <= (n1 - r1); i++) {

            toplam2 = toplam2 * i;
        }
        System.out.println("(n-r).Faktöriyel Sonuç Değeri: " + toplam1);

        kombinasyon = (toplam) / (toplam1 * toplam2);
        System.out.println("Kombinasyon Sonucu: " + kombinasyon);


    }
}
