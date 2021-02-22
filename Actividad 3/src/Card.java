public class Card {
    private String palo;
    private String color;
    private String valor;

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getPalo() {return palo;}
    public void setPalo(String palo) {this.palo = palo;}

    public String getValor() {return valor;}
    public void setValor(String valor) {this.valor = valor;}

    public Card(){
        palo = "";
        color = "";
        valor = "";
    }

    public Card(String pPalo, String pColor, String pValor){
        palo = pPalo;
        color = pColor;
        valor = pValor;
    }
}
