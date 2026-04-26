public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;


    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk(){
        return glownyJezyk;
    }

    public int getLiczbaRepozytoriow(){
        return liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return super.obliczKosztMiesieczny() + (super.getStawkaBazowa() * 0.40);
    }


    @Override
    public String przedstawSie(){
        String opis = "";
        opis = super.przedstawSie();
        opis =  (" moj glowny jezyk programowania to " + glownyJezyk + " w ktorym mam " + liczbaRepozytoriow + " repozytoriow");
        return opis;
    }

    public String wypiszTechnologie(){
        String opis = "";
        opis = "Głowna technologia " + glownyJezyk;
        return opis;
    }

}
