package Composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Componente {
    private String nome;
    private List<Componente> filhos = new ArrayList<>();

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        filhos.add(componente);
    }

    public void remover(Componente componente) {
        filhos.remove(componente);
    }

    @Override
    public void operacao() {
        System.out.println("Composite " + nome + " - Operação");
        for (Componente filho : filhos) {
            filho.operacao();
        }
    }
}
