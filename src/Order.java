import java.util.HashMap;

public class Order {
    private HashMap<Integer, Dish> dishes = new HashMap<>();
    private HashMap<Integer, Drink> drinks = new HashMap<>();

    public void orderAdd(Drink obj){
        drinks.put(obj.hashCode(),obj);
    }

    public void orderAdd(Dish obj){
        dishes.put(obj.hashCode(),obj);
    }

    public void orderRemove(Dish obj){
        dishes.remove(obj.hashCode());
    }

    public void orderRemove(Drink obj){
        drinks.remove(obj.hashCode());
    }

}
