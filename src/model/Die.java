package model;
import java.util.Random;

public class Die {
    private int faceValue;
    Random random = new Random();

    public Die(int faceValue) {
        this.faceValue = faceValue;
    }

    public int Roll(){
        faceValue = random.nextInt(6)+1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
