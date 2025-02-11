package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
private Map<String, Flyweight> flyweights = new HashMap<>();

public Flyweight getFlyweight(String estadoCompartilhado) {
    if (!flyweights.containsKey(estadoCompartilhado)) {
        flyweights.put(estadoCompartilhado, new Flyweight(estadoCompartilhado));
    }
    return flyweights.get(estadoCompartilhado);
}
}
