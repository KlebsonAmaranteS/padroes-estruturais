package adapter;

public class ExemploAdapter {
    public static void main(String[] args) {
        TomadaAmericana tomadaAmericana = new TomadaAmericana();
        TomadaEuropeia adaptador = new Adaptador(tomadaAmericana);
        System.out.println("Voltagem: " + adaptador.voltagem() + "V");
    }
}