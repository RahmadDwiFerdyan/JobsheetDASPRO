/**
 * HargaBayar24
 */
import java.util.Scanner;
public class HargaBayar24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        char merkBuku;

        System.out.println("Masukkan nama merk buku yang dibeli " );
        merkBuku=input.next().charAt(0);
        System.out.println("Masukkan jumlah halaman buku yang dibeli " );
        jmlHalBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli " );
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan besaran diskon barang yang dibeli " );
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        
    }
    
}