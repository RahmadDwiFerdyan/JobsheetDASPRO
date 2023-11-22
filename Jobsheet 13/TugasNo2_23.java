import java.util.Scanner;
public class TugasNo2_23 {

    public static int[][] nilaiMhs;
    public static int jmlMhs, jmlTugas;

    static void inputNilaiMhs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas(minggu): ");
        jmlTugas = scanner.nextInt();
        nilaiMhs = new int[jmlMhs][jmlTugas];
        System.out.println();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " (minggu 1 sampai " + jmlTugas + ")");
            for (int j = 0; j < jmlTugas; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMhs[i][j] = scanner.nextInt();
            }
        }
    }

    static void tampilkanNilaiMhs(int[][] nilaiMhs) {
        System.out.println("\nNilai Mahasiswa:");
    
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jmlTugas; j++) {
                System.out.print(nilaiMhs[i][j] + " ");
            }
            System.out.println();
        }
      
    }

    static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < jmlTugas; j++) {
            int nilaiMinggu = 0;
            for (int i = 0; i < jmlMhs; i++) {
                nilaiMinggu += nilaiMhs[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j + 1;
            }
        }
        return hariTertinggi;
    }

    static void tampilkanMahasiswaTertinggi(int minggu) {
        System.out.println("Mahasiswa dengan nilai tertinggi pada minggu ke-" + minggu + ":");
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i][minggu - 1] == nilaiMaksimal(minggu)) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " == Nilai: " + nilaiMhs[i][minggu - 1]);
            }
        }
    }

    static int nilaiMaksimal(int minggu) {
        int maks = nilaiMhs[0][minggu - 1];
        for (int i = 1; i < jmlMhs; i++) {
            if (nilaiMhs[i][minggu - 1] > maks) {
                maks = nilaiMhs[i][minggu - 1];
            }
        }
        return maks;
    }

    public static void main(String[] args) {
        inputNilaiMhs();
        tampilkanNilaiMhs(nilaiMhs);
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Nilai tertinggi terdapat pada hari ke-" + hariTertinggi);
        tampilkanMahasiswaTertinggi(hariTertinggi);
    }
}