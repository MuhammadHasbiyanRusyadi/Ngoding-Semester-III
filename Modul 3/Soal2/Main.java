package Soal2;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Negara> negaraList = new LinkedList<Negara>();
        Scanner input = new Scanner(System.in);
        int jumlahNegara = input.nextInt();
        input.nextLine();
        for (int i=0; i<jumlahNegara; i++) {
            System.out.print("Nama Negara: ");
            input.next();
            String nama = input.nextLine();
            String jenisKePemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            if (jenisKePemimpinan.equals("monarki")) {
                negaraList.add(new Negara(nama, jenisKePemimpinan, namaPemimpin));
            }
            else {
                System.out.print("Tanggal Merdeka: ");
                int tanggalMerdeka = input.nextInt();
                System.out.print("Bulan Merdeka: ");
                int bulanMerdeka = input.nextInt();
                System.out.print("Tahun Merdeka: ");
                int tahunMerdeka = input.nextInt();
                negaraList.add(new Negara(nama, jenisKePemimpinan, namaPemimpin, tanggalMerdeka, bulanMerdeka, tahunMerdeka));
            }
        }
        for (int i=0; i<negaraList.size(); i++) {
            Negara negara = negaraList.get(i);
            negara.display();
        }

    }
}
