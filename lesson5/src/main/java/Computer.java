public class Computer {

    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void printInfo() {
        System.out.println("Стоимость компьютера: " + cost);
        System.out.println("Модель компьютера: " + model);
        ram.printInfo();
        hdd.printInfo();
    }

}

