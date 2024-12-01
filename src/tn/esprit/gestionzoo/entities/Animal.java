package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0) this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

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
