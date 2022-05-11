package Singleton;
import Adapter.adapterTXT;
import Adapter.adapterXML;
import Adapter.ArquivoTarget;

import java.util.ArrayList;

public class CarroSingleton {
    ArrayList <String> Dados = new ArrayList<>();
    private int log;
    private static CarroSingleton instance;
    private CarroSingleton(){}

    public static CarroSingleton getInstance(){
        if(instance == null)
            instance = new CarroSingleton();
        return instance;
    }
    public String newLog(){
        Dados.add();
    }
    public String logXML(){
        return Dados.toString();
    }
    public String logTXT(){
        return Dados.toString();
    }


}
