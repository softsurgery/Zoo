import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        Animal lion = new Animal();
        Zoo myZoo = new Zoo();

        lion.age = 5;
        lion.family = "Feline";
        lion.isMammal = true;
        lion.name = "Leo";

        myZoo.name = "Hello Zoo";
        myZoo.city = "New York";
        myZoo.nbrCages = 10;
        myZoo.animals[0] = lion;
    }
}