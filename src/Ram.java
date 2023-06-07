public class Ram {
    private String name;
    private int weight;
    private int days;
    private int wool;
    Ram(){
        this.name = "Baran";
        this.weight = 5;
        this.days = 0;
        this.wool = 1000;
    }
    Ram(String name) {
        this.name = name;
        this.weight = 5;
        this.days = 0;
        this.wool = 1000;
    }
    Ram(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.days = 0;
        this.wool = 1000;
    }
    Ram(String name, int weight, int days) {
        this.name = name;
        this.weight = weight;
        this.days = days;
        this.wool = 1000;
    }
    Ram(String name, int weight, int days, int wool) {
        this.name = name;
        this.weight = weight;
        this.days = days;
        this.wool = wool;
    }
    void setName(String name) {
        this.name = name;
    }
    void setWeight(int weight) {
        this.weight = weight;
    }
    void setWool(int wool) {
        this.wool = wool;
    }
    void setDays(int days) {
        this.days = days;
    }
    String getName() {
        return this.name;
    }
    int getWool() {
        return this.wool;
    }
    int getWeight() {
        return this.weight;
    }
    int getDays() {
        return this.days;
    }
    void oneDay() {
        this.weight += 1;
        this.wool += 100;
        this.days += 1;
        System.out.println("Привет, я баран " + this.name + " я прожил 1 день ;)");
    }
    String getInfo() {
        String info = new String();
        info = this.name + "\t" + this.days + "\t" + this.weight + "\t" + this.wool;
        return info;
    }
}
