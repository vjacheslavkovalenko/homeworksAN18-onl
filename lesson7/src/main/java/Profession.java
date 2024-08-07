public enum Profession {
    DIRECTOR(4.0, "Директор"),
    PROGRAMMER(3.0, "Программист"),
    HR(2.5, "Рекрутёр");

    private final double coeff;
    private final String name;

    Profession(double coeff, String name) {
        this.coeff = coeff;
        this.name = name;
    }

    public double getCoeff() {
        return coeff;
    }

    public String getName() {
        return name;
    }

}