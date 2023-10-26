import java.util.Scanner;
public class LinearSearch23 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int key, hasil=0, jumlah, i;
        
        System.out.print("Masukkan jumlah elemen array: ");
        i=sc.nextInt();
        int[] arrayInt = new int [i];
        
        for (i=0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i]=sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (i=0; i<arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-" +hasil); 
                break;
            }
        }

        if (hasil==-1){
            System.out.println("Key tidak ditemukan");
        }
    } 
} 

