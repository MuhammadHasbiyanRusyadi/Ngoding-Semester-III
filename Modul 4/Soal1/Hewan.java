
package Soal1;

public class Hewan {
    String nama;
    String ras;

    public Hewan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Detail Hewan Peliharaan: " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
