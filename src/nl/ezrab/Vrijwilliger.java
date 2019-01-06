package nl.ezrab;

public class Vrijwilliger extends Persoon implements Oproepbaar {

    public Vrijwilliger(String naam) {
        super(naam);
    }

    public double berekenInkomsten() {
        return 0;
    }

    @Override
    public void huurIn(int uren) {
    }
}
