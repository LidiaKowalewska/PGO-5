import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;

    }

    public String getIdPracownika() {
        return idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    public final String pobierzIdPracownika(){
        return idPracownika;
    }


    public double obliczKosztMiesieczny(){
        double kosztyDodatkowe = 0.20 * stawkaBazowa;
        return stawkaBazowa + kosztyDodatkowe;
    }


    public String przedstawSie(){
        String opis = "";
        opis =  ("Hej nazywam sie " + imie + " " + nazwisko + " moj id pracownika to " + idPracownika + " a moja stawka bazowa wynosi " + stawkaBazowa);
        return opis;

    }


    @Override
    public String toString() {
        return String.format("idPracownika: %s | imie: %s | nazwisko: %s | stawkaBazowa: %s", idPracownika, imie, nazwisko, stawkaBazowa);
    }

    @Override
    public boolean equals(Object o) {
        Pracownik toCheck = (Pracownik) o;
        if (this.idPracownika == toCheck.getIdPracownika())
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(idPracownika);
    }
    
}