import java.util.ArrayList;
public class Herd {
    //private Ram rams[];
    private ArrayList<Ram> ramsList;
    private int size;
    Herd() {
        this.ramsList = new ArrayList<Ram>();
        Ram baran = new Ram();
        ramsList.add(baran);
        Ram baranTwo = new Ram("Barash");
        ramsList.add(baranTwo);
        Ram baranThree = new Ram("Barashik");
        ramsList.add(baranThree);
        this.size = 3;
    }
    Ram getRam(int index) {
        return ramsList.get(index);
    }
    int getSize() {
        return this.size;
    }
    String getInfo() {
        String info = new String();
        info = "В стаде сейчас " + this.size + " баранов. \n";
        for (int i = 0; i < this.size; i++) {
            info += this.ramsList.get(i).getInfo() + "\n";
        }
        return info;
    }
    void addRam() {
        this.ramsList.add(new Ram());
        this.size++;
    }
    Ram outRam(int index) {
        Ram ram = this.ramsList.get(index);
        this.ramsList.remove(index);
        this.size--;
        return ram;
    }
    void oneDay() {
        for (int i = 0; i < this.size; i++) {
            this.ramsList.get(i).oneDay();
        }
    }
//    Herd(Ram rams[]) {
//        this.rams = rams;
//    }
//    int getLength() {
//        return rams.length;
//    }
//    void oneDay() {
//
//    }
}
