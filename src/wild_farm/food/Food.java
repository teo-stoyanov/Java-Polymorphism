package wild_farm.food;

public abstract class Food {
    private int quantity;

    Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
