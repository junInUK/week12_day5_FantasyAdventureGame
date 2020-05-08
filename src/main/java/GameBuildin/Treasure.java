package GameBuildin;

public abstract class Treasure {
    private String name;
    private int value;
    private double weight;

    public Treasure(String name, int value, double weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

}
