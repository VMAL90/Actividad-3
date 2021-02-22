public class Actividad_3 {

    public static void main(String[] args) {
        Deck objDeck = new Deck();
        System.out.println("Se ejecuta proceso Shuffle:");
        objDeck.shuffle();
        System.out.println("Se ejecuta proceso Head:");
        objDeck.head();
        System.out.println("Se ejecuta proceso Pick:");
        objDeck.pick();
        System.out.println("Se ejecuta proceso Hand:");
        objDeck.hand();
    }
}
