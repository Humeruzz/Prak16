public final class Dish implements Item {

    private int cost;
    private String name, description;

    public Dish(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
