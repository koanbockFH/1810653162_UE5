package at.ac.fhkufstein.Aufgabe_3;

/*
    Klasse nur minimal Umsetzung, da Übungen nicht gemacht wurden - lt. Lektor geht das in Ordnung
 */
public class Auto extends Fahrzeug implements Comparable<Auto>
{
    private boolean klimaanlage;
    private short airbags;


    public Auto(short reifen, String farbe, short ps, short tueren, short airbags)
    {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }

    @Override
    public int compareTo(Auto o)
    {
        if (this.getPs() == o.getPs())
        {
            return 0;
        }
        else if (this.getPs() < o.getPs())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public String toString()
    {
        return String.format("Mein Auto hat %d PS und fährt mit %d km/h", getPs(), getGeschwindigkeit());
    }
}

