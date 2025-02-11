package proxy;

public class SujeitoReal implements Sujeito {
    @Override
    public void requisicao() {
        System.out.println("SujeitoReal: Processando requisição.");
    }
}
