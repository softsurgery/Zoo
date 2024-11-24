public class Zoo<T> {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int counter;

    public Zoo(String name, String city ) {
        this.animals = new Animal[nbrCages];
        this.counter = 0;
        this.name = name;
        this.city = city;
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
            System.out.println("Animal " + (i+1) + ":");
            System.out.println(animals[i] + "\n");
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


    static Zoo comparerZoo(Zoo z1, Zoo z2){
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
