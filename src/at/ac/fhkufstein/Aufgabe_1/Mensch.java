package at.ac.fhkufstein.Aufgabe_1;

public class Mensch extends Saeugetier
{
    public Mensch(String name, int alter, boolean geschlechtIsMaennlich)
    {
        super(name, alter, geschlechtIsMaennlich);
    }

    @Override
    public String printAll()
    {
        return String.format("%s#%d#%s", getName(), getAlter(), isGeschlechtIsMaennlich() ?  "Männlich" : "Weiblich");
    }
}
