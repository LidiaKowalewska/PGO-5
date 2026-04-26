import java.util.ArrayList;
public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
       this.pracownicy.add(pracownik);
        }

    public void wypiszSkladZespolu(){
        System.out.println("----SKLAD ZESPOLU----");
        for (Pracownik pracownik : pracownicy) {
            System.out.println(pracownik.przedstawSie());
        }
        System.out.println("-----------------");
    }

   public double policzLacznyKoszt(){
        double lacznyKoszt = 0.0;
        for (Pracownik pracownik : pracownicy) {
            lacznyKoszt += pracownik.obliczKosztMiesieczny();
        }
        return lacznyKoszt;
   }

   public Pracownik znajdzPoId(String idPracownika){
        for (Pracownik pracownik : pracownicy) {
            if(pracownik.pobierzIdPracownika().equals(idPracownika)){
                return pracownik;
            }
        }
        return null;
   }

    public void wypiszProgramistow(){
        System.out.println("--------WYPISZ PROGRAMISTOW--------");

        for (Pracownik pracownik : pracownicy) {
            if(pracownik instanceof Programista){
                Programista programista = (Programista) pracownik;

                System.out.println(programista.przedstawSie());
            };

        }
    }

}
