package at.ac.fhkufstein.Aufgabe_1;

public abstract class Saeugetier
{
    private String name;
    private int alter;
    private boolean geschlechtIsMaennlich;

    public Saeugetier(String name, int alter, boolean geschlechtIsMaennlich)
    {
        this.name = name;
        this.alter = alter;
        this.geschlechtIsMaennlich = geschlechtIsMaennlich;
    }

    public abstract String printAll();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public boolean isGeschlechtIsMaennlich()
    {
        return geschlechtIsMaennlich;
    }

    public void setGeschlechtIsMaennlich(boolean geschlechtIsMaennlich)
    {
        this.geschlechtIsMaennlich = geschlechtIsMaennlich;
    }

}
