
package recursive.üs.alma;

import java.util.Scanner;

public class RecursiveÜsAlma {

   
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }
    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us % 2 == 0) {
            int altSonuc = usAlma(taban, us / 2);
            return altSonuc * altSonuc;
        } else {
            int altSonuc = usAlma(taban, (us - 1) / 2);
            return taban * altSonuc * altSonuc;
        }
    }
}
