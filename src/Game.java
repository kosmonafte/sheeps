import java.util.Scanner;

public class Game {

    void startGame() {
        Herd herds = new Herd();
        Shaverma shaverma = new Shaverma();
        int day = 1, choice;
        while (true) {
            System.out.println(shaverma.omNom() + "\n"); //метод поедания барана
            System.out.println(herds.getInfo()); //выводим информацию о стаде
            if (!shaverma.getStatus()) {
                System.out.println("Какого барана отдадим в шаверму?");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt(); // ввод номера барана
                shaverma.inRam(herds.outRam(choice));
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите любое чило и нажмите Enter для завершения дня");
                choice = scanner.nextInt();
            }
            if (day % 5 == 0) {
                herds.addRam();
                System.out.println("Ура, в стаде появился новый барашек!");
            }
            herds.oneDay();
            day++;
        }
    }
}
