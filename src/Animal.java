public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;

        return isMammal == animal.isMammal && family.equals(animal.family) && name.equals(animal.name);
    }

    @Override
    public String toString() {
        return "Animal Name:" + name + "\n" +
                "Family: "+ family +"\n" +
                "Age : " + age + "\n" +
                "Is Mammal: " + isMammal;
    }
}
