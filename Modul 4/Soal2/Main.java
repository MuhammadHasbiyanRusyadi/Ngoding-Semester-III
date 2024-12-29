package Soal2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Pilih Jenis Hewan yang ingin dipilih:");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warna = input.nextLine();
            Kucing kucing = new Kucing(nama, ras, warna);
            kucing.displayKucing();

        }
        else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = input.nextLine();
            System.out.print("Ras: ");
            String ras = input.nextLine();
            System.out.print("Warna Bulu: ");
            String warna = input.nextLine();
            System.out.print("Kemampuan: ");
            String kemampuan = input.nextLine();
            Anjing anjing = new Anjing(nama, ras, warna, kemampuan);
            anjing.displayAnjing();
        }
    }
}