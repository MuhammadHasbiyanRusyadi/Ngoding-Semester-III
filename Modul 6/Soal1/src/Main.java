package Soal1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa(1, "2310869420", "Bayu Spakbor"));
        daftarMahasiswa.add(new Mahasiswa(2, "2310817210020", "Hsbe"));
        daftarMahasiswa.add(new Mahasiswa(3, "23108001", "Reja Knalpot"));
        daftarMahasiswa.add(new Mahasiswa(4, "23108002", "Bintang Selimut"));
        daftarMahasiswa.add(new Mahasiswa(5, "23108003", "Farhan Kebab"));
        daftarMahasiswa.add(new Mahasiswa(6, "231080017", "Amai Latihan Tempur"));
        daftarMahasiswa.add(new Mahasiswa(7, "231080069", "Rian Batagor"));
        daftarMahasiswa.add(new Mahasiswa(8, "231080023", "Sigit Rendang"));
        daftarMahasiswa.add(new Mahasiswa(9, "231080132", "Rusdi Idsur"));
        daftarMahasiswa.add(new Mahasiswa(10, "23108009", "Wahyu Petarunx"));

        String[] kolom = {"NIM", "Nama"};
        String[][] data = new String[daftarMahasiswa.size()][2];
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            data[i][0] = daftarMahasiswa.get(i).getNim();
            data[i][1] = daftarMahasiswa.get(i).getNama();
        }

        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTable table = new JTable(data, kolom);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
