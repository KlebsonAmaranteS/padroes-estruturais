package adapter;

public class Adaptador implements TomadaEuropeia {
    private TomadaAmericana tomada;

    public Adaptador(TomadaAmericana tomada) {
        this.tomada = tomada;
    }

    @Override
    public int voltagem() {
        return tomada.voltagem() * 2; // Converte 110V para 220V
    }
}