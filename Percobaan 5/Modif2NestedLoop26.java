import java.util.Scanner;
public class Modif2NestedLoop26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double [5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double total = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                total += temps [i][j];
            }
            double rata = total/temps[0].length; //Menambahkan nilai rata-rata
            System.out.println("Rata-rata city ke-" + i + " : " + rata);
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        

    }
}