import java.util.Scanner;
public class NestedLoop_2341720122 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double [][] temps  = new double [5][7];

    for (int i=0; i<temps.length; i++){
        System.out.println("Kota ke-" + i);
        for (int j=0; j<temps[0].length; j++){
            System.out.print("Hari ke-" + (j+1) + ": ");
            temps[i][j] = scanner.nextDouble();
        }
        System.out.println();
    }


    for (int i=0; i<temps.length; i++){
        System.out.print("Kota ke-" + (i+1) + ": ");
        double total = 0;
        for (double printTemps : temps[i]){
            total += printTemps;
            System.out.print(printTemps + " ");
        }
        double rerata = total/ temps[i].length;
        System.out.println();
        System.out.printf("  >>Rata-rata suhu kota ke-" + (i+1) +": %.2f", rerata);
        System.out.println();
    }
  }
}
