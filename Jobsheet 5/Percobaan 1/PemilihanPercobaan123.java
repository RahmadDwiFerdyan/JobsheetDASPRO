import java.util.Scanner;
public class PemilihanPercobaan123 {

    public static void main(String[] args) {
    Scanner input23 = new Scanner(System.in); {

    System.out.println("Masukkan angka: ");
    int angka = input23.nextInt();
    String hasil;

    hasil = (angka % 2 == 0) ? " Bilangan Genap" : " Bilangan Ganjil";

    System.out.println("Angka " +angka +hasil);

        }    
    }
}