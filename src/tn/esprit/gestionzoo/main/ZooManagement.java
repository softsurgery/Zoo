package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
       Zoo z = new Zoo("Parc Animeaux","New York");
       Animal lion = new Animal("Feline", "Leo", 7,true);
       Terrestrial t = new Terrestrial("Feline","Fennec",4,true,4);
       Dolphin d = new Dolphin("Fish","ABC",2,true,"Meditarian Islands",30);
       Penguin p1 = new Penguin("Bird", "Peng",5,false,"Pacific Ocean",150);
       Penguin p2 = new Penguin("Bird", "X",5,false,"Pacific Ocean",189);

       z.addAquaticAnimal(d);
       z.addAquaticAnimal(p1);
       z.addAquaticAnimal(p2);


       z.displayNumberOfAquaticsByType();
    }
}