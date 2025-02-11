package bridge;

public class DesenhoAPI1 implements DesenhoAPI {
    @Override
    public void desenharCirculo(int x, int y, int raio) {
        System.out.printf("API1.circulo em %d:%d raio %d\n", x, y, raio);
    }
}