package flyweight;

public class ExemploFlyweight {
    public static void main(String[] args) {
        FabricaFlyweight fabrica = new FabricaFlyweight();
        Flyweight flyweight1 = fabrica.getFlyweight("estado_compartilhado_1");
        flyweight1.operacao("estado_unico_1");

        Flyweight flyweight2 = fabrica.getFlyweight("estado_compartilhado_1");
        flyweight2.operacao("estado_unico_2");
    }
}
