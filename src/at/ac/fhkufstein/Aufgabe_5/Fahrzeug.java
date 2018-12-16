package at.ac.fhkufstein.Aufgabe_5;

/*
    Klasse nur minimal Umsetzung, da Übungen nicht gemacht wurden - lt. Lektor geht das in Ordnung
 */
public class Fahrzeug
{
    public Fahrzeug(short reifen, Color farbe, short ps, short tueren)
    {
        if(farbe == null)
        {
            farbe = Color.BLACK;
        }

        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = 0;
    }

    public short getReifen()
    {
        return reifen;
    }

    public void setReifen(short reifen)
    {
        this.reifen = reifen;
    }

    public Color getFarbe()
    {
        return farbe;
    }

    public void setFarbe(Color farbe)
    {
        this.farbe = farbe;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getTueren()
    {
        return tueren;
    }

    public void setTueren(short tueren)
    {
        this.tueren = tueren;
    }

    public boolean isGestartet()
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet)
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl()
    {
        return Anzahl;
    }

    public static void setAnzahl(int anzahl)
    {
        Anzahl = anzahl;
    }

    private short reifen;
    private Color farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int Anzahl;

}
