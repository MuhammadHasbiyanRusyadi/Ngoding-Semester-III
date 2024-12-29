import java.util.Scanner;
public class PRAK104_2310817210020_MuhammadHasbiyanRusyadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] tanganabu = input.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] tanganbagas = input.nextLine().split(" ");

        int skorabu = 0;
        int skorbagas = 0;
        for (int i = 0; i < 3; i++) {
            char abu = tanganabu[i].charAt(0);
            char bagas = tanganbagas[i].charAt(0);

            if (abu == bagas) {
            } else if ((abu == 'B' && bagas == 'G') ||
                       (abu == 'G' && bagas == 'K') ||
                       (abu == 'K' && bagas == 'B')) {
                skorabu++;
            } else {
                skorbagas++;
            }}
        if (skorabu > skorbagas){
            System.out.println("Abu");
        } else if ( skorbagas > skorabu){
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }}}
