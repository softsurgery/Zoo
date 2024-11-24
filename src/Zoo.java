public class Zoo{
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;

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

    private int counter;

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
