package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Animal Terrestrial Name:" + super.getName() + "\n" +
                "Family: "+ super.getFamily() +"\n" +
                "Age : " + super.getAge() + "\n" +
                "Is Mammal: " + super.isMammal() + "\n" +
                "Number of legs: " + nbrLegs;
    }
}
