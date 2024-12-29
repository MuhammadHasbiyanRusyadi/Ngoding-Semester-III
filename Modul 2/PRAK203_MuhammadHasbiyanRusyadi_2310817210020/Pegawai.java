package PRAK203_MuhammadHasbiyanRusyadi_2310817210020;
public class Pegawai {
    // nama class yang tertera pada Modul yang diberi tidak sesuai dengan nama file.java yang diminta
    // dimana pada modul classnya yaitu "public class Employee" seharusnya "public class Pegawai"
    public String nama;
    public String asal;
    // atribut asal pada modul bertipe data char, seharusnya string jika ingin menyesuaikan dengan output yang diminta
    //  sebelumnya public char asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }

    public void setJabatan(String j) {
        this.jabatan = j;
        // tidak terdapat argumen pada kode yang diberi di modul
        // sebelumnya public void setJabatan()
    }
}