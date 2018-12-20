package wild_farm.animlas;

abstract class Mammal extends Animal{

    String livingRegion;
    Mammal(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion) {
        super( animalType,animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }
}
