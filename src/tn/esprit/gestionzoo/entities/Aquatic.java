package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal{
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aquatic aquatic)) return false;
        return aquatic.getAge() == super.getAge() && aquatic.getName().equals(super.getName()) && aquatic.getHabitat().equals(habitat);
    }

    @Override
    public String toString() {
        return "Animal Aquatic Name:" + super.getName() + "\n" +
                "Family: "+ super.getFamily() +"\n" +
                "Age : " + super.getAge() + "\n" +
                "Is Mammal: " + super.isMammal() + "\n" +
                "Habitat: " + habitat;
    }
}