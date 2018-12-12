package at.ac.fhkufstein.Aufgabe_2;

public class Aufgabe_2
{
    public static void main(String[] args)
    {
        Mensch axel = new Mensch("Axel", "Basset",25);
        axel.Status();
        axel = new Student("Axel", "Basset",25, "123", "Web");
        axel.Status();
    }
}
