public class HDD {

    private String name;
    private double volume;
    private String type;

    public HDD() {
        this("", 0, "");
    }

    public HDD(String name, double volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("HDD название: " + name);
        System.out.println("HDD объем: " + volume);
        System.out.println("HDD тип: " + type);
    }

}
