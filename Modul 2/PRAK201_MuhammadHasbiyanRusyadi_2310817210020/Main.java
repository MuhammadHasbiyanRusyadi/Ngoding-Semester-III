package PRAK201_MuhammadHasbiyanRusyadi_2310817210020;

class Buah {
    String Nama;
    double Berat;
    double Harga;
    double jumlahNukar;

    void showInfo() {
        System.out.println("Nama buah: " + Nama);
        System.out.println("Berat: " + Berat);
        System.out.println("Harga: " + Harga);
        System.out.println("Jumlah Beli:  " + jumlahNukar + " kg");
        System.out.println("Harga Sebelum Diskon: Rp" + hargaSebelumBeforeDiskon());
        System.out.println("Total Diskon: Rp" + totDiskon());
        System.out.println("Harga Setelah Diskon: Rp" + hargaSetelahBeforeDiskon());
    }
    double hargaSebelumBeforeDiskon() {
        return jumlahNukar / Berat * Harga;
    }
    double totDiskon() {

        double persenanDiskon = Math.floor(jumlahNukar / 4) * 0.02;
        return persenanDiskon * Harga * 4;}
    double hargaSetelahBeforeDiskon() {
        return hargaSebelumBeforeDiskon() - totDiskon();}
}
public class Main {
    public static void main(String[] args) {
        Buah buah1 = new Buah();
        buah1.Nama = "Apel";
        buah1.Berat = 0.4;
        buah1.Harga = 7000;
        buah1.jumlahNukar= 40;
        buah1.showInfo();

        System.out.println();

        Buah buah2 = new Buah();
        buah2.Nama = "Mangga";
        buah2.Berat = 0.2;
        buah2.Harga = 3500;
        buah2.jumlahNukar = 15;
        buah2.showInfo();

        System.out.println();

        Buah buah3 = new Buah();
        buah3.Nama = "Alpukat";
        buah3.Berat = 0.25;
        buah3.Harga = 10000;
        buah3.jumlahNukar = 12;
        buah3.showInfo();}
}
