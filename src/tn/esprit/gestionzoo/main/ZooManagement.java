package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
       Zoo z = new Zoo("Parc Animeaux","New York");
       Animal lion = new Animal("Feline", "Leo", 7,true);
       Aquatic a = new Aquatic("Fish","Salmon",1,false,"Atlantic Ocean");
       Terrestrial t = new Terrestrial("Feline","Fennec",4,true,4);
       Dolphin d = new Dolphin("Fish","ABC",2,true,"Meditarian Islands",30);
       Penguin p = new Penguin("Bird", "Peng",5,false,"Pacific Ocean",150);
    }
}