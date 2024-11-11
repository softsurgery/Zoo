public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Leo", 5, true);
        Animal tigre = new Animal("Feline", "Xao", 2, true);
        Animal requin = new Animal("Fish", "ShiShi", 3, false);
        Zoo<Animal> myZoo = new Zoo<Animal>("Hello Zoo", "New York", 5);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        myZoo.displayAllAnimals();

        int pos1 = myZoo.searchAnimal(requin);
        if (pos1 != -1) System.out.println("Position of Requin in Zoo: " + pos1);
        else System.out.println("Requin not found in Zoo");

        int pos2 = myZoo.searchAnimal(lion);
        if (pos2 != -1) System.out.println("Position of Lion in Zoo: " + pos2);
        else System.out.println("Lion not found in Zoo");
    }
}