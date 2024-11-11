public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Leo", 5, true);
        Animal tigre = new Animal("Feline", "Xao", 2, true);
        Animal requin = new Animal("Poisson", "ShiShi", 3, false);
        Zoo myZoo = new Zoo("Hello Zoo", "New York", 10);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
    }
}