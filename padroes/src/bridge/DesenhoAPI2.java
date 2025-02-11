package bridge;

public class DesenhoAPI2 implements DesenhoAPI {
    @Override
    public void desenharCirculo(int x, int y, int raio) {
        System.out.printf("API2.circulo em %d:%d raio %d\n", x, y, raio);
    }
}
