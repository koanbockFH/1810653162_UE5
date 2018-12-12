package at.ac.fhkufstein.Aufgabe_3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        List<Auto> liste = new LinkedList<>();
        liste.add(new Auto((short)4, "schwarz", (short)50, (short)5, (short)2));
        liste.add(new Auto((short)4, "schwarz", (short)200, (short)5, (short)2));
        liste.add(new Auto((short)4, "schwarz", (short)400, (short)5, (short)2));
        liste.add(new Auto((short)4, "schwarz", (short)150, (short)5, (short)2));
        liste.add(new Auto((short)4, "schwarz", (short)100, (short)5, (short)2));
        Collections.sort(liste);

        for (Auto a: liste)
        {
            System.out.println(a);
        }
    }
}
