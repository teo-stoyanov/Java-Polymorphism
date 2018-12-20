package wild_farm.animlas;

public abstract class Animal {
    private String animalType;
    String animalName;
    double animalWeight;
    int foodEaten;

    Animal(String animalType, String animalName, double animalWeight, int foodEaten) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eatFood(int quantity);

    public abstract boolean feedAnimal(String food);
}
