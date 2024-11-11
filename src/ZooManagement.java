public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Leo", 5, true);
        Animal tigre = new Animal("Feline", "Xao", 2, true);
        Animal requin = new Animal("Poisson", "ShiShi", 3, false);
        Zoo myZoo = new Zoo("Hello Zoo", "New York", 2);

        if (myZoo.addAnimal(lion)){
            System.out.println("Lion added successfully");
        } else {
            System.out.println("No more cages available");
        }

        if (myZoo.addAnimal(tigre)){
            System.out.println("Tigre added successfully");
        } else {
            System.out.println("No more cages available");
        }

        if (myZoo.addAnimal(requin)){
            System.out.println("Requin added successfully");
        } else {
            System.out.println("No more cages available");
        }
    }
}