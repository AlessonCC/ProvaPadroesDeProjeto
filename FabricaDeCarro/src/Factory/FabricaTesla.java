package Factory;

public class FabricaTesla implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
        return new TeslaModelS();
    }
}
