package at.ac.fhkufstein.Aufgabe_4;

import javax.swing.*;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        String input1 = JOptionPane.showInputDialog("Gimme something");
        String input2 = JOptionPane.showInputDialog("Gimme something");
        String input3 = JOptionPane.showInputDialog("Gimme something");

        boolean anyEqual = false;
        if(input1 == input2){
            anyEqual = true;
        }
        else if(input1 == input3)
        {
            anyEqual = true;
        }
        else if(input2 == input3)
        {
            anyEqual = true;
        }

        if(anyEqual)
        {
            System.out.println("Sie haben mind. 2 gleiche Werte eingegeben");
        }
        else{
            System.out.println("Sie haben keine gleichen Werte eingegeben");
        }
    }
}
