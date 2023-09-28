public class ContohVariabel24 {
   
    public static void main(String args[]){
        String hobiSaya = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 20;
        double ipk = 3.24, tinggi = 1.78;

        System.out.println(hobiSaya);
        System.out.println("Apakah pandai? " +isPandai);
        System.out.println("Jenis kelamin: " +jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSaya);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
