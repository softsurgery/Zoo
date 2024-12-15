package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin Name:" + super.getName() + "\n" +
                "Family: "+ super.getFamily() +"\n" +
                "Age : " + super.getAge() + "\n" +
                "Is Mammal: " + super.isMammal() + "\n" +
                "Habitat: " + super.getHabitat() + "\n" +
                "Swimming Speed: " + swimmingSpeed;
    }
}
