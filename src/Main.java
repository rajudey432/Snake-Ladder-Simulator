import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //System.out.printf("Welcome to DieRoll");
        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a " + dieRoll);


    }
}
