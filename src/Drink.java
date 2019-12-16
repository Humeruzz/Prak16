public final class Drink implements Item {
    private int cost;
    private String name, description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
