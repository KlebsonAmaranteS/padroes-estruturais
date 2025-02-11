package decorator;

public class ExemploDecorator {
    public static void main(String[] args) {
        Componente simples = new ComponenteConcreto();
        Componente decorador1 = new DecoradorConcretoA(simples);
        Componente decorador2 = new DecoradorConcretoB(decorador1);
        System.out.println(decorador2.operacao());
    }
}
