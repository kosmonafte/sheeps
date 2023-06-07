public class Herd {
    private Ram rams[];
    Herd() {
        this.rams = new Ram[10];
        for (int i = 0; i < rams.length; i++) {
            this.rams[i] = new Ram();
            this.rams[i].setName(String.valueOf((char)((int)(Math.random()*1000))));
            this.rams[i].setWeight((int)(Math.random()*100));
            this.rams[i].setWool((int)(Math.random()*1000));
        }
        //System.out.println("Я отработал");
    }
//    Herd(Ram rams[]) {
//        this.rams = rams;
//    }
    Ram getRam(int index) {
        //System.out.println("Я отработал");
        return this.rams[index];
    }
    int getLength() {
        return rams.length;
    }
    void oneDay() {

    }
}
