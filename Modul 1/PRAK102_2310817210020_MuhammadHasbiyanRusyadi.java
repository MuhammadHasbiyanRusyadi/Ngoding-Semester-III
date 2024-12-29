import java.util.Scanner;

public class PRAK102_2310817210020_MuhammadHasbiyanRusyadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();
        int deretot = 0;

        while (deretot <= 10) {
                if (bil % 5 == 0) {
                    System.out.print((bil / 5 - 1));
                } else {
                    System.out.print(bil);
                }
                if (deretot < 10){
                    System.out.print(",");
                }
        bil++;
        deretot++;}
        }}