package proxy;

public class Proxy implements Sujeito {
    private SujeitoReal sujeitoReal;

    @Override
    public void requisicao() {
        if (sujeitoReal == null) {
            sujeitoReal = new SujeitoReal();
        }
        System.out.println("Proxy: Verificando acesso antes de processar a requisição.");
        sujeitoReal.requisicao();
    }
}

