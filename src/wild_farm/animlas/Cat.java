package wild_farm.animlas;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType,String animalName,  double animalWeight, int foodEaten, String livingRegion, String breed) {
        super( animalType,animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(int quantity) {
        this.foodEaten += quantity;
    }

    @Override
    public boolean feedAnimal(String food) {
        return true;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format
                ("%s[%s, %s, %s, %s, %d]",getClass().getSimpleName(),this.animalName,this.breed,decimalFormat.format(this.animalWeight),this.livingRegion,this.foodEaten);
    }
}
