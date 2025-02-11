package flyweight;

public class Flyweight {
    private String estadoCompartilhado;

    public Flyweight(String estadoCompartilhado) {
        this.estadoCompartilhado = estadoCompartilhado;
    }

    public void operacao(String estadoUnico) {
        System.out.println("Flyweight: Compartilhado '" + estadoCompartilhado + "' e único '" + estadoUnico + "'.");
    }
}

