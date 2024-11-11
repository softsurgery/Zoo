import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nbrCages;

        do {
            System.out.print("Enter the number of cages in the zoo: ");
            nbrCages = scanner.nextInt();
            scanner.nextLine();
        }while(nbrCages<0);

        String zooName;
        do {
            System.out.print("Enter the name of the zoo: ");
            zooName = scanner.nextLine();
        }while(zooName.length()<3);

        if (nbrCages == 0) {
            System.out.println(zooName+" ne comporte pas des cages");
        } else if (nbrCages == 1) {
            System.out.println(zooName+" comporte un seul cage");
        } else {
            System.out.println(zooName+" comporte "+nbrCages+" cages");
        }

    }
}