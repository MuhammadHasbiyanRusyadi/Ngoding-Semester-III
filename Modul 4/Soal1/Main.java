
package Soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String ras = input.nextLine();
        Hewan hewan = new Hewan(nama, ras);
        hewan.display();
    }
}
