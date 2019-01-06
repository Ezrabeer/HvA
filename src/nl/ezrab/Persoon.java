package nl.ezrab;

public abstract class Persoon implements Comparable<Persoon> {

    public String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public abstract double berekenInkomsten();

    public int compareTo(Persoon persoon) {
        return this.naam.compareTo(persoon.naam);
    }

    @Override
    public String toString() {
        return this.naam;
    }
}
