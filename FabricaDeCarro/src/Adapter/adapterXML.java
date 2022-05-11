package Adapter;
import Factory.Carro;
import Factory.FabricaDeCarro;
import Singleton.CarroSingleton;

public class adapterXML implements ArquivoTarget{
    private String nomeDoArquivo = null;
    CarroSingleton carro = CarroSingleton.getInstance();
    @Override
    public void carregarArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        System.out.println("Arquivo Carregado!");
    }
    @Override
    public String printarArquivo() {
        System.out.println("Nome Do arquivo: "+ nomeDoArquivo +".xml");
        return carro.logXML();
    }
}
