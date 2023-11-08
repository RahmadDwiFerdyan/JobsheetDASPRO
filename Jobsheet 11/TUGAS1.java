import java.util.Scanner;
public class TUGAS1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, j, k, jumlah;
    System.out.print("Masukkan nilai N = ");
    jumlah = sc.nextInt();

    for (i=0; i<jumlah; i++){
        for (j=(jumlah-1); j>i; j--){
            System.out.print(" ");
        }
        for (k=0; k<=i; k++){
            System.out.print((k+1));
        }
    System.out.println();
    }
  }  
}
