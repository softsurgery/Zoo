public class Zoo<T> {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int counter;

    public Zoo(String name, String city, int nbrCages ) {
        this.animals = new Animal[nbrCages];
        this.counter = 0;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public boolean addAnimal(Animal animal){
        if(counter < nbrCages) {
            animals[counter] = animal;
            counter++;
            return true;
        } else return false;
    }

    public void displayAllAnimals(){
        for(int i=0; i<counter; i++){
            System.out.println("Animal " + (i+1) + ":");
            System.out.println(animals[i] + "\n");
        }
    }

    public int searchAnimal(Animal animal){
        int i = 0;
        boolean found = false;
        while(i < counter && !found) {
            if (animals[i].name.equals(animal.name)) found = true;
            else i++;
        }
        if(found) return i;
        else return -1;
    }

    @Override
    public String toString() {
        return "Zoo Name:" + name + "\n" +
                "City: "+ city +"\n" +
                "Number of Cages: " + nbrCages;
    }
}
