package Soal2;

public class Kucing extends HewanPeliharaan{
    String warna;
    public Kucing(String nama, String ras, String warna) {
        super(nama, ras);
        this.warna = warna;
    }
    public void displayKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warna);
    }
}