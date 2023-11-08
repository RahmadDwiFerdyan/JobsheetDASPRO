import java.util.Scanner;
public class TUGAS2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, j, jumlah;
    System.out.print("Masukkan jumlah N = ");
    jumlah = sc.nextInt();

    for (i=0; i<jumlah; i++){
        for (j=jumlah; j>i; j--){
            System.out.print("*");
        }
    System.out.println();
    }

    }
}
