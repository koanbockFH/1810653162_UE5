package at.ac.fhkufstein.Aufgabe_2;

public class Student extends Mensch
{
    private String martrikelnummer;
    private String studiengang;

    public Student(String vorname, String nachname, int alter, String martrikelnummer, String studiengang)
    {
        super(vorname, nachname, alter);
        this.martrikelnummer = martrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public void Status()
    {
        System.out.println(String.format("Student;%s#%s#%d%s%s", getVorname(), getNachname(), getAlter(),
                getMartrikelnummer(), getStudiengang()));
    }

    public String getMartrikelnummer()
    {
        return martrikelnummer;
    }

    public void setMartrikelnummer(String martrikelnummer)
    {
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudiengang()
    {
        return studiengang;
    }

    public void setStudiengang(String studiengang)
    {
        this.studiengang = studiengang;
    }
}
