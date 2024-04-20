public class RAM {

    private String name;
    private double volume;

    public RAM() {
        this("", 0);
    }

    public RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("RAM название: " + name);
        System.out.println("RAM объем: " + volume);
    }


}
