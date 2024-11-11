public class CircusAnimalImpl extends Animal implements CircusAnimal {

    public CircusAnimalImpl(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    @Override
    public void dance() {
        System.out.println("I dance");
    }

    @Override
    public void playInstrument() {
        System.out.println("I play an instrument");
    }

    @Override
    public void sing() {
        System.out.println("I sing");
    }

    @Override
    public void think() {
        System.out.println("I think");
    }
}
