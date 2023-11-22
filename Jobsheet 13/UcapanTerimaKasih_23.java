import java.util.Scanner;
public class UcapanTerimaKasih_23 {
   
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }  

    public static String UcapanTambahan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan pesan tambahan yang ingin anda sampaikan: ");
        String pesantambahan = sc.nextLine();
        sc.close();
        return pesantambahan;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you " +nama+ " for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like I could ask you anything.\n" 
        + tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
