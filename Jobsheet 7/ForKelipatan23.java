import java.util.Scanner;

public class ForKelipatan23 {

    public static void main(String[] args) {
    Scanner input23 = new Scanner(System.in);

    int kelipatan, jumlah=0, counter=0;

    System.out.println("Masukkan bilangan kelipatan (1-9): ");
    kelipatan=input23.nextInt();

    for (int i = 1; i <= 50; i++ ) {
        if (i % kelipatan == 0) {
            jumlah += 1;
            counter++;
      }
    }
  } 
}
