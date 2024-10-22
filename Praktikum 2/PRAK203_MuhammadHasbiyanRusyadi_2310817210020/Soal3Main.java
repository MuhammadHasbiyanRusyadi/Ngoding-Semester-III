package PRAK203_MuhammadHasbiyanRusyadi_2310817210020;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        p1.nama = "Roi";
        //pada akhiran tidak menambahkan titik koma (semikolon)
        // sebelumnya p1.nama = "Roi"
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        p1.umur = 17;
        // atribut umur pada objek p1 belum diinisialisasi pada modul

        System.out.println("Nama: " + p1.getNama());
        // atributnya diubah menjadi nama karena tidak ada atribut bernama "Nama pegawai" pada output yang diminta pada modul
        //  sebelumnya System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
        // pada line diatas tertinggal kata "tahun" setelah dipanggilnya atribut p1.umur agar sesuai dengan output yang diminta pada modul
        // sebelumnya System.out.println("Umur: " + p1.umur);
    }
}
