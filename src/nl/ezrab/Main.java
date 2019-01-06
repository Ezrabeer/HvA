package nl.ezrab;

public class Main {

    public static void main(String[] args) {
        Bedrijf bedrijf = new Bedrijf("Bedrijf");

        Werknemer werknemer = new Werknemer(3000, "Teun");

        Vrijwilliger vrijwilliger = new Vrijwilliger("Pieter");

        Manager manager = new Manager(5000, "Ezra");
        manager.kenBonusToe(200);

        Zzper zzper = new Zzper(5.05, "Mike");
        zzper.huurIn(40);


        System.out.println("Bedrijf " + bedrijf.toString() + ":");
        bedrijf.neemInDienst(werknemer);
        bedrijf.neemInDienst(vrijwilliger);
        bedrijf.neemInDienst(manager);
        bedrijf.neemInDienst(zzper);
        bedrijf.printInkomsten();

        System.out.println("Aantal in management: " + bedrijf.aantalManagers());
    }
}