public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo( String name, String city, int nbrCages ) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo Name:" + name + "\n" +
                "City: "+ city +"\n" +
                "Number of Cages: " + nbrCages;
    }
}
