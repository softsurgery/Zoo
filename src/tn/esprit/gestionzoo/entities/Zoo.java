package tn.esprit.gestionzoo.entities;

public class Zoo{
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int counter;
    private int aquaticCounter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getAquaticCounter() {
        return aquaticCounter;
    }

    public void setAquaticCounter(int aquaticCounter) {
        this.aquaticCounter = aquaticCounter;
    }


    public Zoo(String name, String city ) {
        this.animals = new Animal[nbrCages];
        this.counter = 0;

        this.name = name;
        this.city = city;

        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCounter = 0;
    }

    boolean isZooFull(){
        return counter == nbrCages;
    }

    public boolean addAnimal(Animal animal){
        if(!isZooFull()) {
            int pos = searchAnimal(animal);
            if (pos == -1){
                animals[counter] = animal;
                counter++;
                return true;

            }
        }
        return false;
    }

    public boolean addAquaticAnimal(Aquatic aquatic){
        if(aquaticCounter < 10) {
            int pos = searchAquatic(aquatic);
            if (pos == -1){
                aquaticAnimals[aquaticCounter] = aquatic;
                aquaticCounter++;
                return true;

            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal){
        int pos = searchAnimal(animal);
        if(pos!= -1){
            for(int i=pos; i<counter-1; i++){
                animals[i] = animals[i+1];
            }
            counter--;
            return true;
        }
        return false;
    }

    public void displayAllAnimals(){
        for(int i=0; i<counter; i++){
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + (i+1) + ":");
            System.out.println(animals[i] + "\n");
        }
    }

    public void makeAquaticSwim(){
        for(int i=0; i<aquaticCounter; i++){
           aquaticAnimals[i].swim();
        }
    }

    public int searchAnimal(Animal animal){
        int i = 0;
        boolean found = false;
        while(i < counter && !found) {
            if (animals[i].equals(animal)) found = true;
            else i++;
        }
        if(found) return i;
        else return -1;
    }

    public int searchAquatic(Aquatic aquatic){
        int i = 0;
        boolean found = false;
        while(i < aquaticCounter && !found) {
            if (aquaticAnimals[i].equals(aquatic)) found = true;
            else i++;
        }
        if(found) return i;
        else return -1;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.counter > z2.counter) return z1;
        else if(z1.counter < z2.counter) return z2;
        else return null;
    }

    @Override
    public String toString() {
        return "Zoo Name:" + name + "\n" +
                "City: "+ city +"\n" +
                "Number of Cages: " + nbrCages;
    }
}
