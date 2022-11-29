package add;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(0,"Cat");
        listOfAnimals.add(1, "Dog");
        listOfAnimals.add(2, "Crow");
        listOfAnimals.add(3, "Frog");
        listOfAnimals.add(4, "Hen");
        listOfAnimals.add(5, "Horse");
        listOfAnimals.add(6, "Mouse");
        listOfAnimals.add(7, "Tiger");
        System.out.println(listOfAnimals);
    }
}
