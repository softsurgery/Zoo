package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin Name:" + super.getName() + "\n" +
                "Family: "+ super.getFamily() +"\n" +
                "Age : " + super.getAge() + "\n" +
                "Is Mammal: " + super.isMammal() + "\n" +
                "Habitat: " + super.getHabitat() + "\n" +
                "Swimming Depth: " + swimmingDepth;
    }
}
