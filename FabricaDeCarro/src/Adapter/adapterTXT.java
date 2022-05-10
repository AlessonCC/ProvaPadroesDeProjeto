package Adapter;
import Factory.Carro;
import Factory.FabricaDeCarro;

public class adapterTXT implements ArquivoTarget{
    @Override
    public void carregarArquivo(String nomeDoArquivo) {

    }

    @Override
    public String printarArquivo() {

        return null;
    }
}
