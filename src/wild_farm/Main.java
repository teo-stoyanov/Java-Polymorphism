package wild_farm;

import wild_farm.animlas.*;
import wild_farm.food.Food;
import wild_farm.food.Meat;
import wild_farm.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String NOT_MOUSE_FOOD = "Mice are not eating that type of food!";
        final String NOT_TIGER_FOOD = "Tigers are not eating that type of food!";
        final String NOT_ZEBRA_FOOD = "Zebras are not eating that type of food!";

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<Animal> animals = new ArrayList<>();
        while (true) {
            String[] animalInput = console.readLine().split("\\s+");
            if ("End".equals(animalInput[0])) {
                break;
            }
            String[] foodInput = console.readLine().split("\\s+");

            String animalType = animalInput[0];
            String animalName = animalInput[1];
            double animalWeight = Double.parseDouble(animalInput[2]);
            String animalLivingRegion = animalInput[3];

            String foodType = foodInput[0];
            int foodQuantity = Integer.parseInt(foodInput[1]);

            Food food;
            switch (foodType) {
                case "Meat":
                    food = new Meat(foodQuantity);
                    break;
                default:
                    food = new Vegetable(foodQuantity);
                    break;
            }

            switch (animalInput[0]) {
                case "Cat":
                    String breed = animalInput[4];
                    Cat cat = new Cat(animalType, animalName, animalWeight, 0, animalLivingRegion, breed);
                    cat.makeSound();
                    cat.eatFood(food.getQuantity());
                    animals.add(cat);
                    break;
                case "Mouse":
                    Mouse mouse = new Mouse(animalType, animalName, animalWeight, 0, animalLivingRegion);
                    mouse.makeSound();
                    if (mouse.feedAnimal(food.getClass().getSimpleName())) {
                        mouse.eatFood(food.getQuantity());
                    } else {
                        System.out.println(NOT_MOUSE_FOOD);
                    }
                    animals.add(mouse);
                    break;
                case "Tiger":
                    Tiger tiger = new Tiger(animalType, animalName, animalWeight, 0, animalLivingRegion);
                    tiger.makeSound();
                    if (tiger.feedAnimal(food.getClass().getSimpleName())) {
                        tiger.eatFood(food.getQuantity());
                    } else {
                        System.out.println(NOT_TIGER_FOOD);
                    }
                    animals.add(tiger);
                    break;
                case "Zebra":
                    Zebra zebra = new Zebra(animalType, animalName, animalWeight, 0, animalLivingRegion);
                    zebra.makeSound();
                    if (zebra.feedAnimal(food.getClass().getSimpleName())) {
                        zebra.eatFood(food.getQuantity());
                    } else {
                        System.out.println(NOT_ZEBRA_FOOD);
                    }
                    animals.add(zebra);
                    break;
            }

        }

        animals.forEach(System.out::println);
    }
}
