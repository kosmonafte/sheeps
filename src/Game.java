import java.util.Scanner;

public class Game {

    void startGame() {
        Herd herds = new Herd();
        Shaverma shaverma = new Shaverma();
        int day = 1, choice;
        while (true) {
            int count = day % 5;
            if (count == 0) {
                herds.addRam();
            }
            herds.oneDay();
            System.out.println(herds.getInfo());
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (day == 7) {
                herds.outRam(3);
            }
            day++;
        }
    }
}
