package decorator;

public class DecoradorConcretoA extends Decorador {
    public DecoradorConcretoA(Componente componente) {
        super(componente);
    }

    @Override
    public String operacao() {
        return "DecoradorConcretoA(" + super.operacao() + ")";
    }
}

class DecoradorConcretoB extends Decorador {
    public DecoradorConcretoB(Componente componente) {
        super(componente);
    }

    @Override
    public String operacao() {
        return "DecoradorConcretoB(" + super.operacao() + ")";
    }
}
