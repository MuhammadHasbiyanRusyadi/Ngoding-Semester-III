import java.util.Scanner;
public class PRAK105_2310817210020_MuhammadHasbiyanRusyadi {
    public static final double phi = 3.14;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double volume = phi * r * r * t;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);
    }}
