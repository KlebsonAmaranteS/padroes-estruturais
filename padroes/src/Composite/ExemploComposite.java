package Composite;

public class ExemploComposite {
    public static void main(String[] args) {
        Componente folha1 = new Folha("1");
        Componente folha2 = new Folha("2");
        Composite composite = new Composite("Composite");
        composite.adicionar(folha1);
        composite.adicionar(folha2);
        composite.operacao();
    }
}
