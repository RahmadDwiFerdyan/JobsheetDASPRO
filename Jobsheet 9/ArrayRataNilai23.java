import java.util.Scanner;
public class ArrayRataNilai23 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, countLulus = 0, countTdkLulus = 0;
    double totalLulus = 0, totalTdkLulus = 0;
    double rerataLulus, rerataTdkLulus;

    System.out.print("Masukkan jumlah mahasiswa: ");
    i = sc.nextInt();

    int[] nilaiMhs = new int [i];

    for (i = 0; i < nilaiMhs.length; i++){
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (i = 0; i < nilaiMhs.length; i++){
        if (nilaiMhs[i]>70){
        totalLulus += nilaiMhs[i];
        countLulus += 1; 
        } else {
        totalTdkLulus += nilaiMhs[i];
        countTdkLulus += 1;
        }
    }

    rerataLulus = totalLulus/countLulus;
    rerataTdkLulus = totalTdkLulus/countTdkLulus;
    System.out.println("Rata-rata nilai lulus = "+rerataLulus);
    System.out.println("Rata-rata nilai tidak lulus = "+rerataTdkLulus);
    }
}
