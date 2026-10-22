public class Main {
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [ ] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [ ] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

    public static void main(String[] args) {
        kattHotell hotell = new kattHotell();

        hotell.laggTill(new Katt("Bosse", 202, "ragdoll"));
        hotell.laggTill(new Katt("Indra", 350, "tuxedo"));
        if (!hotell.laggTill(new Katt("Buse", 202, "siames"))) {
            System.out.println("Dublett nekad.");
        }
        System.out.println("Antal: " + hotell.antalKatter());

        hotell.listaAlla();
    }
}