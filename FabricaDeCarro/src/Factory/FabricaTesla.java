package Factory;
public class FabricaTesla implements FabricaDeCarro{

    @Override
    public Carro criarCarro(String nome) {
        if(nome.equalsIgnoreCase("ModelS")){
            TeslaModelS ModelS = new TeslaModelS();
            System.out.println(ModelS.exibirInfo());
        }
        if (nome.equalsIgnoreCase("ModelX")) {
            TeslaModelX ModelX = new TeslaModelX();
            System.out.println(ModelX.exibirInfo());
        }
        return null;

    }
}
