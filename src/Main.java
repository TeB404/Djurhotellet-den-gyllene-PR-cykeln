import java.util.Scanner;
public class Main {
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [x] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [x] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kattHotell hotell = new kattHotell();
        int val = 0;

        while (val != 4) {
            System.out.println("\n---- Tass & My's meny ----");
            System.out.println("\n1. Checka in katt\n2. Lista alla incheckade\n3. Sök katt namn\n4. Avsluta");
            System.out.println("Välj: ");
            val = scanner.nextInt();
            scanner.nextLine();

            switch (val) {
                case 1 -> {
                    System.out.println("Namn: ");
                    String namn = scanner.nextLine();
                    System.out.println("Chipnummer: ");
                    int chip = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ras: ");
                    String ras = scanner.nextLine();
                    hotell.laggTill(new Katt(namn, chip, ras));
                }
                case 2 ->
                    hotell.listaAlla();
                case 3 -> {
                    System.out.println("Ange namn att söka: ");
                    String soktNamn = scanner.nextLine();
                    Katt hittad = hotell.hittaNamn(soktNamn);
                    if (hittad != null) {
                        System.out.println("Hittad: " + hittad.getNamn() + " (" + hittad.getRas() + ") - Chip: " + hittad.getChipnummer());
                    } else {
                        System.out.println("Ingen katt med det namnet är incheckad här.");
                    }
                }
                case 4 -> System.out.println("Avslutar. Välkommen åter!");
                default -> System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }
}