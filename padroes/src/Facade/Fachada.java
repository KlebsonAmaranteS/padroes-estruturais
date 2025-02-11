package Facade;

public class Fachada {
    private SubSistema1 subsistema1;
    private SubSistema2 subsistema2;

    public Fachada() {
        this.subsistema1 = new SubSistema1();
        this.subsistema2 = new SubSistema2();
    }

    public String operacao() {
        StringBuilder resultado = new StringBuilder();
        resultado.append(subsistema1.operacao1()).append("\n");
        resultado.append(subsistema2.operacao2());
        return resultado.toString();
    }
}
