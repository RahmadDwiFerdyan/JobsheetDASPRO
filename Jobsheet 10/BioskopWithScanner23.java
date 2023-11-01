import java.util.Scanner;
public class BioskopWithScanner23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int baris, kolom, menu;
    char repeat;
    String nama, next;
    String[][] penonton = new String[4][2];

do{
    System.out.println("## DAFTAR MENU ##");
    System.out.println("(1)Input data penonton" );
    System.out.println("(2)Tampilkan daftar penonton" );
    System.out.println("(3)Exit" );
    System.out.print(">> Masukkan nomor pilihan menu: ");
    menu=sc.nextInt();
    sc.nextLine();
    System.out.println("");

    switch(menu){
        case 1:
            while (true){
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            
            if (baris>4 || kolom>2){
                System.out.println("*WARNING: Kursi tidak tersedia");
            } else if(penonton[baris-1][kolom-1] != null){
                System.out.println("*WARNING: Kursi sudah ditempati");
            }else {
            penonton[baris-1][kolom-1] = nama;
            }
            
            System.out.print(">Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
            } break;
            
        case 2:
            for (int i = 0; i < penonton.length; i++) {
                for(int j = 0; j < penonton[i].length; j++)
                if (penonton[i][j] == null){
                penonton[i][j] = "***";
            }
            System.out.println("Penonton baris ke-"+(i+1)+" : "+ String.join(",", penonton[i]));
            } break;

        case 3: break;
    }
    
    System.out.print("\n>> Pilih menu lain (y/n): ");
    repeat = sc.next().charAt(0);

}
    while (repeat == 'y');
}
}
  

