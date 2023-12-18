/*
* .Q1 ->  Create one superclass HillStations and three subclasses Manali, Mussoorie,
Gulmarg. Subclasses extend the superclass and override its location() and famousFor()
method.
(1)-> call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.
As it refers to the base class object and the base class method overrides the superclass
method; the base class method is invoked at runtime.
call the location() and famousFor() method by the all subclass’,and print accordingly.*/


// Superclass HillStations
class HillStations {
    // Method to get the location of the hill station
    void location() {
        System.out.println("Location is: ");
    }

    // Method to get what the hill station is famous for
    void famousFor() {
        System.out.println("Famous For: ");
    }
}

// Subclass Manali
class Manali extends HillStations {
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }


    void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {

    void location() {
        System.out.println("Mussorie is in Uttrakhand");
    }
    void famousFor() {
        System.out.println("It is famous for education institutions.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }
    void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}

public class Hills {
    public static void main(String[] args) {
        HillStations genericHillStation = new HillStations();
        genericHillStation.location();
        genericHillStation.famousFor();

        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();
        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
