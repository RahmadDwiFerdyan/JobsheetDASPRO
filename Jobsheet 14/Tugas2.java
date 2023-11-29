import java.util.Scanner;
public class Tugas2 {
    static int penjumlahan (int n){
        if (n==1){
            System.out.print("1");
            return (1);
        } else {
            int before = (penjumlahan(n-1));
            System.out.print(" + " + n);
            return n + before;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int batas;
        System.out.print("Masukkan nilai batas: ");
        batas=sc.nextInt();

        System.out.println("Hasil: ");
        int hasil = penjumlahan(batas);
        System.out.print(" = " + hasil);
    }
}
