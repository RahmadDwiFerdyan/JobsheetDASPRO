import java.util.Scanner;
public class Tugas1 { 
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int n;

            System.out.print("Masukkan nilai: ");
            n = sc.nextInt();

            System.out.println("Descending rekursif: ");
            deretDescendingRekursif(n);
            System.out.println("\nDescending iteratif: ");
            deretDescendingIteratif(n);
        }
    
        static void deretDescendingRekursif(int n) {
            if (n == 0) {
                System.out.print(n);
            } else {
                System.out.print(n + " ");
                deretDescendingRekursif(n - 1);
            }
        }
    
        static void deretDescendingIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
}
