package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Leo", 5, true);
        Animal lion2 = new Animal("Feline", "Leonardo", 7, true);
        Animal tigre = new Animal("Feline", "Xao", 2, true);
        Animal requin = new Animal("Fish", "ShiShi", 3, false);
        Zoo myZoo = new Zoo("Hello tn.esprit.gestionzoo.entities.Zoo", "New York");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        lion.setAge(2);

        Zoo clone = Zoo.comparerZoo(myZoo,new Zoo("tn.esprit.gestionzoo.entities.Zoo","Bizerte"));

        System.out.println(lion.equals(lion2));

        myZoo.displayAllAnimals();

        int pos1 = myZoo.searchAnimal(requin);
        if (pos1 != -1) System.out.println("Position of Requin in tn.esprit.gestionzoo.entities.Zoo: " + pos1);
        else System.out.println("Requin not found in tn.esprit.gestionzoo.entities.Zoo");

        int pos2 = myZoo.searchAnimal(lion);
        if (pos2 != -1) System.out.println("Position of Lion in tn.esprit.gestionzoo.entities.Zoo: " + pos2);
        else System.out.println("Lion not found in tn.esprit.gestionzoo.entities.Zoo");
    }
}