import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> alCartas;
    private ArrayList<String> alLista2;

    public void setAlCartas(ArrayList<Card> alCartas) {this.alCartas = alCartas;}
    public ArrayList<Card> getAlCartas() {return alCartas;}

    public void setAlLista2(ArrayList<String> alLista2) {this.alLista2 = alLista2;}
    public ArrayList<String> getAlLista2() {return alLista2;}

    public Deck(){
        //Se inicializan las 52 cartas
        alCartas = new ArrayList<Card>();
        alCartas.addAll(creaPalo("Corazon","Rojo"));
        alCartas.addAll(creaPalo("Diamante","Rojo"));
        alCartas.addAll(creaPalo("Pica","Negro"));
        alCartas.addAll(creaPalo("Trebol","Negro"));
    }

    private ArrayList<Card> creaPalo(String pPalo, String pColor){
        Card vCarta;
        ArrayList<Card> vPalo = new ArrayList<Card>();

        //Crea A
        vCarta = new Card(pPalo,pColor,"A");
        vPalo.add(vCarta);

        //Crea cartas del 2 al 10
        for(int y = 2; y<11; y++){
            vCarta = new Card(pPalo,pColor, Integer.toString(y));
            vPalo.add(vCarta);
        }

        //Crea J
        vCarta = new Card(pPalo,pColor,"J");
        vPalo.add(vCarta);

        //Crea Q
        vCarta = new Card(pPalo,pColor,"Q");
        vPalo.add(vCarta);

        //Crea K
        vCarta = new Card(pPalo,pColor,"K");
        vPalo.add(vCarta);

        return vPalo;
    }

    //Mezcla el arreglo
    public void shuffle(){
        Collections.shuffle(alCartas);
        System.out.println("Se mezcló el Deck.");
    }

    //Obtiene la primera carta
    public void head(){
        pintaElimina(0);
        System.out.println("Quedan " + alCartas.size() + " cartas en deck.");
    }

    //Obtiene carta al azar
    public void pick(){
        int vIndex = (int) Math.random()*alCartas.size()+1;
        pintaElimina(vIndex);
        System.out.println("Quedan " + alCartas.size() + " cartas en deck.");
    }

    //Obtiene 5 cartas al azar
    public void hand(){
        int vIndex;
        for(int y = 0; y <5; y++){
            vIndex = (int) Math.random()*alCartas.size()+1;
            pintaElimina(vIndex);
        }
        System.out.println("Quedan " + alCartas.size() + " cartas en deck.");
    }

    //Obtiene carta por indice y la elimina
    private void pintaElimina(int pIndex){
        Card vCarta;
        vCarta = alCartas.get(pIndex);
        System.out.println(vCarta.getPalo() + ", " + vCarta.getColor() + ", " + vCarta.getValor());
        alCartas.remove(pIndex);
    }
}
