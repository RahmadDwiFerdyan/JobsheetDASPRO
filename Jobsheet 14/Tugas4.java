import java.util.Scanner;
public class Tugas4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int bulan;
            System.out.println("Masukkan berapa bulan: ");
            bulan=sc.nextInt();
            System.out.println("Pasangan marmut pada bulan ke " + bulan + " adalah : " + jumlahMarmut(bulan));
        }
    
        public static int jumlahMarmut(int bulan) {
            if (bulan == 0) {
                return 0;
            } else if (bulan == 1) {
                return 1;
            } else {
                return jumlahMarmut(bulan - 1) + jumlahMarmut(bulan - 2);
            }
        }
}
