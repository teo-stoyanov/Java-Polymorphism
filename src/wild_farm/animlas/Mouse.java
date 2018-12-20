package wild_farm.animlas;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    private static final String MOUSE_FOOD = "Vegetable";

    public Mouse( String animalType, String animalName,double animalWeight, int foodEaten, String livingRegion) {
        super( animalType,animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(int quantity) {
        this.foodEaten += quantity;
    }

    @Override
    public boolean feedAnimal(String food) {
       return food.equals(MOUSE_FOOD);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format
                ("%s[%s, %s, %s, %d]",getClass().getSimpleName(),this.animalName,decimalFormat.format(this.animalWeight),this.livingRegion,this.foodEaten);
    }
}
