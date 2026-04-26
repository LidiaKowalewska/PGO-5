public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa,boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean getCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }
    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return super.obliczKosztMiesieczny() + (super.getStawkaBazowa() * 0.10);
    }

    @Override
    public String przedstawSie(){
        String opis = "";
        opis = super.przedstawSie();
        opis =  (" Jestem testerem " + czyAutomatyzujacy + " Zajmuje sie " + liczbaScenariuszy + " Scenariuszami");
        return opis;
    }

    public void uruchomRaportTestow() {
        String typTestera = czyAutomatyzujacy ? "Automatyzujący" : "Manualny";

        System.out.println("--- RAPORT TESTERA ---");
        System.out.println("Typ: " + typTestera);
        System.out.println("Liczba przygotowanych scenariuszy: " + liczbaScenariuszy);

        if (czyAutomatyzujacy && liczbaScenariuszy > 10) {
            System.out.println("Status: Wysoka wydajność automatyzacji.");
        } else {
            System.out.println("Status: Standardowy proces testowy.");
        }
        System.out.println("-----------------------");
    }

}
