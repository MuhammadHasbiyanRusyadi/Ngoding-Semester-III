package Soal2;

public class Anjing extends HewanPeliharaan{
    String warna;
    String kemampuan;
    public Anjing(String nama, String ras, String warna, String kemampuan) {
        super(nama, ras);
        this.warna = warna;
        this.kemampuan = kemampuan;
    }
    public void displayAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warna);
        System.out.println("Memiliki kemampuan : " + kemampuan);
    }
}
