public class Main {
    // [x] 1. Skapa en katt som har ett namn, chipnummer och ras
    // [x] 2. Skapa ett katthotell som har en lista för alla incheckade katter
    // [x] 3. Göra så att katthotellet kan ta emot en ny katt till listan
    // [ ] 4. Stoppa incheckningen om chipnumret redan finns på hotellet
    // [ ] 5. Ropa upp och skriva ut alla katter som är på plats
    // [ ] 6. Säga till om hotellet är helt tomt när vi ropar upp

    public static void main(String[] args) {
        kattHotell hotell = new kattHotell();

        hotell.laggTill(new Katt("Bosse", 202, "ragdoll"));
        hotell.laggTill(new Katt("Indra", 350, "tuxedo"));
        if (!hotell.laggTill(new Katt("Buse", 202, "siames"))) {
            System.out.println("Dublett nekad.");
        }
        System.out.println("Antal: " + hotell.antalKatter());
    }
}