package nl.ezrab;

import java.util.ArrayList;

public class Bedrijf {

    private String naam;
    private ArrayList<Persoon> medewerkers = new ArrayList<>();

    public Bedrijf(String naam) {
        this.naam = naam;
    }

    public void printInkomsten() {
        for (Persoon persoon : this.medewerkers) {
            if (persoon instanceof Vrijwilliger) {
                System.out.println(persoon.naam + " bedankt voor uw inzet!");
            } else {
                System.out.println(persoon.naam + ", inkomsten: " + persoon.berekenInkomsten());
            }
        }
    }

    public int aantalManagers() {
        int i = 0;
        for (Persoon persoon : this.medewerkers) {
            if (persoon instanceof Manager) {
                i++;
            }
        }
        return i;
    }

    public void neemInDienst(Persoon persoon) {
        medewerkers.add(persoon);
    }

    public String toString() {
        return this.naam;
    }
}
