import java.util.ArrayList;
import java.util.List;

public class kattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean finns(int chipnummer) {
        for (Katt k : katter) {
            if (k.getChipnummer() == chipnummer) {
                return true;
            }
        } return false;
    }

    public boolean laggTill(Katt katt) {
        if (finns(katt.getChipnummer())) {
            System.out.println("Nekad: Chip " + katt.getChipnummer() + " är redan incheckat");
            return false;
        }
        katter.add(katt);
        return true;
    }

    public void listaAlla() {
        if (katter.isEmpty()) {
                System.out.println("Hotellet är tomt. Inga katter inchekade.");
                return;
            }
        for (Katt k : katter) {
            System.out.println(k.getNamn() + " (" + k.getRas() + ") - Chip: " + k.getChipnummer());
        }
    }

    public int antalKatter() {
       return katter.size();
    }

    public Katt hittaNamn(String namn) {
        for (Katt k : katter) {
            if (k.getNamn().equalsIgnoreCase(namn)) {
                return k;
            }
        }
        return null;
    }
}
