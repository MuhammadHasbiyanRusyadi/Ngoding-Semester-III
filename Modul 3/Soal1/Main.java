
package Soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Dadu> daduList = new LinkedList<Dadu>();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = input.nextInt();
        for (int i = 0; i < jumlahDadu; i++) {
            daduList.add(new Dadu());
        }
        int total = 0;
        for (int i = 0; i < daduList.size(); i++) {
            Dadu dadu = daduList.get(i);
            System.out.println("Dadu ke-" + (i + 1) + ": " + dadu.info());

            total += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan: " + total);

    }
}
