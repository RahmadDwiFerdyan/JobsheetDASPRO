import java.util.Scanner;
public class ForKelipatan23 {

    public static void main(String[] args) {
    Scanner input23 = new Scanner(System.in);

    int kelipatan, counter=0;
    double jumlah=0, rerata;

    System.out.println("Masukkan bilangan kelipatan (1-9): ");
    kelipatan=input23.nextInt();

    for (int i=1 ; i <= 50; i++ ) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
            
      }
    }

    rerata = jumlah / counter;

    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %f\n", kelipatan, jumlah);
    System.out.printf("Rata-rata dari bilangan-bilangan kelipatan %d adalah %f", kelipatan, rerata);

  } 
}
