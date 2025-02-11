package bridge;

public class ExemploBridge {
    public static void main(String[] args) {
        Forma circulo1 = new Circulo(1, 2, 3, new DesenhoAPI1());
        circulo1.desenhar();

        Forma circulo2 = new Circulo(5, 7, 11, new DesenhoAPI2());
        circulo2.desenhar();
    }
}
