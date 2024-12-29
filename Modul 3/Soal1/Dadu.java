package Soal1;
import java.util.Random;
public class Dadu {
    private int Isidadu;
    public Dadu(){
        this.acakdadu();
    }
    public void acakdadu() {
        Random acak = new Random();
        this.Isidadu = acak.nextInt(6) + 1;
    }

    public String info() {
        return "Bernilai " + Isidadu;
    }
    public int getNilai(){
        return Isidadu;
    }
}
