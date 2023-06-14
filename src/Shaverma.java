import java.util.Scanner;

public class Shaverma {
    void startGame(){
        Herd herds = new Herd();
        int i = 1, choice;
        while (true) {
            int count = i % 5;
            if (count == 0) {
                herds.addRam();
            }
            for (int j = 0; j < herds.getSize(); j++) {
                herds.getRam(j).oneDay();
            }
            System.out.println(herds.getInfo());
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            i++;
            if (i == 7) {
                herds.outRam(3);
            }
        }

    }
}
