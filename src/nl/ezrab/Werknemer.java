package nl.ezrab;

public class Werknemer extends Persoon {

    private int laatstePersoneelsnummer;
    protected double maandSalaris;
    private int personeelsnummer;

    public Werknemer(double maandSalaris, String naam) {
        super(naam);
        this.maandSalaris = maandSalaris;

        this.personeelsnummer = 1000;
        this.personeelsnummer++;
    }

    @Override
    public double berekenInkomsten() {
        return this.maandSalaris;
    }
}
