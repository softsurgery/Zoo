package tn.esprit.gestionzoo.entities;

public class Aquatic  extends Animal{
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

    @Override
    public String toString() {
        return "Animal Aquatic Name:" + super.getName() + "\n" +
                "Family: "+ super.getFamily() +"\n" +
                "Age : " + super.getAge() + "\n" +
                "Is Mammal: " + super.isMammal() + "\n" +
                "Habitat: " + habitat;
    }
}
