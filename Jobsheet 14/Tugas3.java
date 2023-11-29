import java.util.Scanner;

public class Tugas3 {
    static boolean cekBilanganPrima(int n, int pembagi) {
        if (n <= 1) {
            return false;
        }
        if (pembagi == 1) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        } else {
            return cekBilanganPrima(n, pembagi - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan yang ingin dicek: ");
        int bilangan = sc.nextInt();

        boolean hasil = cekBilanganPrima(bilangan, bilangan - 1);

        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}