package wild_farm.animlas;

import java.text.DecimalFormat;

public class Tiger extends Felime {
    private static final String TIGER_FOOD = "Meat";
    public Tiger( String animalType, String animalName,double animalWeight, int foodEaten, String livingRegion) {
        super( animalType,animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(int quantity) {
        this.foodEaten += quantity;
    }

    @Override
    public boolean feedAnimal(String food) {
        return food.equals(TIGER_FOOD);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format
                ("%s[%s, %s, %s, %d]",getClass().getSimpleName(),this.animalName,decimalFormat.format(this.animalWeight),this.livingRegion,this.foodEaten);
    }
}
