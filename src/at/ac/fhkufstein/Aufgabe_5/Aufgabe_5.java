package at.ac.fhkufstein.Aufgabe_5;

public class Aufgabe_5
{
    public static void main(String[] args)
    {
        Auto a = new Auto((short)4, null, (short)5, (short)5, (short)2);
        System.out.println(a);

        Auto b = new Auto((short)4, Color.BLUE, (short)5, (short)5, (short)2);
        System.out.println(b);
    }
}
