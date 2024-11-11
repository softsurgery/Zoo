public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int counteur;

    public Zoo(String name, String city, int nbrCages ) {
        this.animals = new Animal[nbrCages];
        this.counteur = 0;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    boolean addAnimal(Animal animal){
        if(counteur < nbrCages) {
            animals[counteur] = animal;
            counteur++;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Zoo Name:" + name + "\n" +
                "City: "+ city +"\n" +
                "Number of Cages: " + nbrCages;
    }
}
