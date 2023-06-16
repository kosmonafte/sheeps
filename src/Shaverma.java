import java.io.PrintStream;
import java.util.Scanner;

public class Shaverma {
    private boolean full;
    private Ram ram;
    private int meat;
    private int whool;
    Shaverma() {
        this.full = false;
    }
    void inRam(Ram ram) {
        this.ram = ram;
        this.full = true;
        this.meat += ram.getWeight();
        this.whool += ram.getWool();
    }
    boolean getStatus(){
        return this.full;
    }
    String omNom() {
        String str = new String();
        String strTmp = new String();
        if (!full) {
            //System.out.println("Оу, в шаурмичной нет барана");
            str = "Оу, в шаурмичной нет барана";
        } else {
            //this.ram.omNomOneDay();
            //strTmp = (ram.getWeight() >= 0)?Integer.toString(ram.getWeight()):"0";
            //str = "В шаурмичной сейчас кушают " + ram.getName() + ", сегодня съели 30 кг, в " + ram.getName() + " осталось " + strTmp + " кг";
            //if (this.ram.getWeight() <= 0) {
                ////this.ram = null;
                //this.full = false;
            //}
            this.meat -= 30;
            str = "В шаурмичной осталось " + this.meat + " кг мяса";
            if (this.meat < 30) {
                this.full = false;
            }
        }
        return str;
    }

}
