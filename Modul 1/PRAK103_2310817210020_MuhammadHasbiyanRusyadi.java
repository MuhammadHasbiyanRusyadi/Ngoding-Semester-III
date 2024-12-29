import java.util.Scanner;
public class PRAK103_2310817210020_MuhammadHasbiyanRusyadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumbil = input.nextInt();
        int bilawal = input.nextInt();

        int hitung = 0;
            do {
                if (bilawal % 2 != 0) {
                    System.out.print(bilawal);
                    hitung++;
                    if ( hitung < sumbil ){
                        System.out.print(",");
                }}
                bilawal++;
            } while (hitung < sumbil);
        }}
