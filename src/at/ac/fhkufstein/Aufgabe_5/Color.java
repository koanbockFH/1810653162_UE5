package at.ac.fhkufstein.Aufgabe_5;

public enum Color
{
    SILVER("silver"),
    RED("red"),
    BLACK("black"),
    BLUE("blue"),
    WHITE("white");


    private final String name;

    private Color(String s)
    {
        name = s;
    }

    public boolean equalsName(String otherName)
    {
        return name.equals(otherName);
    }

    public String toString()
    {
        return this.name;
    }
}
