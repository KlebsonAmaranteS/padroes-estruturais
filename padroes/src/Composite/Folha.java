package Composite;

public class Folha implements Componente {
    private String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    @Override
    public void operacao() {
        System.out.println("Folha " + nome + " - Operação");
    }
}

