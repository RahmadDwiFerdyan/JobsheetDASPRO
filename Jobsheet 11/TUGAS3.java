import java.util.Scanner;
public class TUGAS3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai N = ");
    int jumlah = sc.nextInt();

    for (int i = 0; i < jumlah; i++) {
        for (int j = 0; j < jumlah; j++) {
            if (i == 0 || (i == jumlah - 1) || j == 0 || (j == jumlah - 1)) {
                System.out.print(jumlah + " ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
  }
}
